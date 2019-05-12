package com.mwt.oes.service.impl;

import com.mwt.oes.dao.*;
import com.mwt.oes.domain.*;
import com.mwt.oes.service.TeacherBankManageService;
import com.mwt.oes.util.FindContentWithImage;
import com.mwt.oes.util.MultipleAnswersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherBankManageServiceImpl implements TeacherBankManageService {
    @Autowired
    ProgramingLanguageMapper programingLanguageMapper;
    @Autowired
    BankSingleChoiceQueMapper bankSingleChoiceQueMapper;
    @Autowired
    BankMultipleChoiceQueMapper bankMultipleChoiceQueMapper;
    @Autowired
    BankJudgeQueMapper bankJudgeQueMapper;
    @Autowired
    BankFillQueMapper bankFillQueMapper;

    @Override
    public List<Map<String, Object>> getSingleList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankSingleChoiceQueExample bankSingleChoiceQueExample = new BankSingleChoiceQueExample();
        bankSingleChoiceQueExample.setOrderByClause("single_id asc");
        List<BankSingleChoiceQue> bankSingleChoiceQueList = bankSingleChoiceQueMapper.selectByExample(bankSingleChoiceQueExample);
        for (BankSingleChoiceQue bankSingleChoiceQue : bankSingleChoiceQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankSingleChoiceQueList.indexOf(bankSingleChoiceQue) + 1);
            map.put("singleId", bankSingleChoiceQue.getSingleId());
            Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
            map.put("content", singleContentMap.get("content"));
            map.put("pictureSrc", singleContentMap.get("pictureSrc"));
            map.put("choiceA", bankSingleChoiceQue.getChoiceA());
            map.put("choiceB", bankSingleChoiceQue.getChoiceB());
            map.put("choiceC", bankSingleChoiceQue.getChoiceC());
            map.put("choiceD", bankSingleChoiceQue.getChoiceD());
            map.put("choiceE", bankSingleChoiceQue.getChoiceE());
            map.put("choiceF", bankSingleChoiceQue.getChoiceF());
            map.put("choiceG", bankSingleChoiceQue.getChoiceG());
            map.put("singleAnswer", bankSingleChoiceQue.getSingleAnswer());
            map.put("composeFlag", bankSingleChoiceQue.getComposeFlag());
            map.put("answerExplain", bankSingleChoiceQue.getAnswerExplain());
            int langId = bankSingleChoiceQue.getLangId();
            map.put("langId", langId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(langId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchSingleList(String content, Integer langId, String composeFlag) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankSingleChoiceQueExample bankSingleChoiceQueExample = new BankSingleChoiceQueExample();
        BankSingleChoiceQueExample.Criteria criteria = bankSingleChoiceQueExample.createCriteria();
        if (!content.equals("undefined")) {
            criteria.andSingleContentLike("%" + content + "%");
        }
        if(langId != 0) {
            criteria.andLangIdEqualTo(langId);
        }
        if (!composeFlag.equals("undefined")) {
            criteria.andComposeFlagEqualTo(composeFlag);
        }
        bankSingleChoiceQueExample.setOrderByClause("single_id asc");
        List<BankSingleChoiceQue> bankSingleChoiceQueList = bankSingleChoiceQueMapper.selectByExample(bankSingleChoiceQueExample);
        for (BankSingleChoiceQue bankSingleChoiceQue : bankSingleChoiceQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankSingleChoiceQueList.indexOf(bankSingleChoiceQue) + 1);
            map.put("singleId", bankSingleChoiceQue.getSingleId());
            Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
            map.put("content", singleContentMap.get("content"));
            map.put("pictureSrc", singleContentMap.get("pictureSrc"));
            map.put("choiceA", bankSingleChoiceQue.getChoiceA());
            map.put("choiceB", bankSingleChoiceQue.getChoiceB());
            map.put("choiceC", bankSingleChoiceQue.getChoiceC());
            map.put("choiceD", bankSingleChoiceQue.getChoiceD());
            map.put("choiceE", bankSingleChoiceQue.getChoiceE());
            map.put("choiceF", bankSingleChoiceQue.getChoiceF());
            map.put("choiceG", bankSingleChoiceQue.getChoiceG());
            map.put("composeFlag", bankSingleChoiceQue.getComposeFlag());
            map.put("singleAnswer", bankSingleChoiceQue.getSingleAnswer());
            map.put("answerExplain", bankSingleChoiceQue.getAnswerExplain());
            int allLangId = bankSingleChoiceQue.getLangId();
            map.put("langId", allLangId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(allLangId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public int deleteSingle(Integer singleId) {
        int result = bankSingleChoiceQueMapper.deleteByPrimaryKey(singleId);
        return result;
    }

    @Override
    public int insertSingleInfo(Map<String, Object> obj) {
        String content = (String) obj.get("content");
        String pictureSrc = (String) obj.get("pictureSrc");
        String singleContent = content + "[[[" + pictureSrc.substring(40) + "]]]";

        String choiceA = (String) obj.get("choiceA");
        String choiceB = (String) obj.get("choiceB");
        String choiceC = (String) obj.get("choiceC");
        String choiceD = (String) obj.get("choiceD");
        String choiceE = (String) obj.get("choiceE");
        String choiceF = (String) obj.get("choiceF");
        String choiceG = (String) obj.get("choiceG");
        String singleAnswer = (String) obj.get("singleAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankSingleChoiceQue bankSingleChoiceQue = new BankSingleChoiceQue();
        bankSingleChoiceQue.setSingleContent(singleContent);
        bankSingleChoiceQue.setChoiceA(choiceA);
        bankSingleChoiceQue.setChoiceB(choiceB);
        bankSingleChoiceQue.setChoiceC(choiceC);
        bankSingleChoiceQue.setChoiceD(choiceD);
        bankSingleChoiceQue.setChoiceE(choiceE);
        bankSingleChoiceQue.setChoiceF(choiceF);
        bankSingleChoiceQue.setChoiceG(choiceG);
        bankSingleChoiceQue.setSingleAnswer(singleAnswer);
        bankSingleChoiceQue.setAnswerExplain(answerExplain);
        bankSingleChoiceQue.setLangId(langId);

        int result = bankSingleChoiceQueMapper.insertSelective(bankSingleChoiceQue);
        return result;
    }

    @Override
    public int updateSingleInfo(Map<String, Object> obj) {
        Integer singleId = (Integer) obj.get("singleId");
        String content = (String) obj.get("content");
        String pictureSrc = (String) obj.get("pictureSrc");
        String singleContent = content;
        if (!pictureSrc.equals("")) {
            singleContent = content + "[[[" + pictureSrc.substring(40) + "]]]";
        }
        String choiceA = (String) obj.get("choiceA");
        String choiceB = (String) obj.get("choiceB");
        String choiceC = (String) obj.get("choiceC");
        String choiceD = (String) obj.get("choiceD");
        String choiceE = (String) obj.get("choiceE");
        String choiceF = (String) obj.get("choiceF");
        String choiceG = (String) obj.get("choiceG");
        String answerExplain = (String) obj.get("answerExplain");
        String singleAnswer = (String) obj.get("singleAnswer");
        Integer langId = (Integer) obj.get("langId");

        BankSingleChoiceQue bankSingleChoiceQue = new BankSingleChoiceQue();
        bankSingleChoiceQue.setSingleId(singleId);
        bankSingleChoiceQue.setSingleContent(singleContent);
        bankSingleChoiceQue.setChoiceA(choiceA);
        bankSingleChoiceQue.setChoiceB(choiceB);
        bankSingleChoiceQue.setChoiceC(choiceC);
        bankSingleChoiceQue.setChoiceD(choiceD);
        bankSingleChoiceQue.setChoiceE(choiceE);
        bankSingleChoiceQue.setChoiceF(choiceF);
        bankSingleChoiceQue.setChoiceG(choiceG);
        bankSingleChoiceQue.setSingleAnswer(singleAnswer);
        bankSingleChoiceQue.setAnswerExplain(answerExplain);
        bankSingleChoiceQue.setLangId(langId);

        int result = bankSingleChoiceQueMapper.updateByPrimaryKeySelective(bankSingleChoiceQue);
        return result;
    }

    @Override
    public int insertSingleList(List<Map<String, Object>> singleList) {
        int result = 0;
        for (Map<String, Object> single : singleList) {
            BankSingleChoiceQue bankSingleChoiceQue = new BankSingleChoiceQue();
            bankSingleChoiceQue.setSingleContent((String) single.get("singleContent"));
            bankSingleChoiceQue.setChoiceA((String) single.get("choiceA"));
            bankSingleChoiceQue.setChoiceB((String) single.get("choiceB"));
            bankSingleChoiceQue.setChoiceC((String) single.get("choiceC"));
            bankSingleChoiceQue.setChoiceD((String) single.get("choiceD"));
            bankSingleChoiceQue.setChoiceE((String) single.get("choiceE"));
            bankSingleChoiceQue.setChoiceF((String) single.get("choiceF"));
            bankSingleChoiceQue.setChoiceG((String) single.get("choiceG"));
            bankSingleChoiceQue.setSingleAnswer((String) single.get("singleAnswer"));
            bankSingleChoiceQue.setAnswerExplain((String) single.get("answerExplain"));
            bankSingleChoiceQue.setLangId((Integer) single.get("langId"));
            result = bankSingleChoiceQueMapper.insertSelective(bankSingleChoiceQue);
        }
        return result;
    }

    // --------------------------------------------------------------------------------------多选题
    @Override
    public List<Map<String, Object>> getMultipleList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankMultipleChoiceQueExample bankMultipleChoiceQueExample = new BankMultipleChoiceQueExample();
        bankMultipleChoiceQueExample.setOrderByClause("multiple_id asc");
        List<BankMultipleChoiceQue> bankMultipleChoiceQueList = bankMultipleChoiceQueMapper.selectByExample(bankMultipleChoiceQueExample);
        for (BankMultipleChoiceQue bankMultipleChoiceQue : bankMultipleChoiceQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankMultipleChoiceQueList.indexOf(bankMultipleChoiceQue) + 1);
            map.put("multipleId", bankMultipleChoiceQue.getMultipleId());
            Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
            map.put("content", multipleContentMap.get("content"));
            map.put("pictureSrc", multipleContentMap.get("pictureSrc"));
            map.put("choiceA", bankMultipleChoiceQue.getChoiceA());
            map.put("choiceB", bankMultipleChoiceQue.getChoiceB());
            map.put("choiceC", bankMultipleChoiceQue.getChoiceC());
            map.put("choiceD", bankMultipleChoiceQue.getChoiceD());
            map.put("choiceE", bankMultipleChoiceQue.getChoiceE());
            map.put("choiceF", bankMultipleChoiceQue.getChoiceF());
            map.put("choiceG", bankMultipleChoiceQue.getChoiceG());
            String [] answerArr = bankMultipleChoiceQue.getMultipleAnswer().split("");
            map.put("multipleAnswer", answerArr);
            map.put("composeFlag", bankMultipleChoiceQue.getComposeFlag());
            map.put("answerExplain", bankMultipleChoiceQue.getAnswerExplain());
            int langId = bankMultipleChoiceQue.getLangId();
            map.put("langId", langId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(langId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchMultipleList(String content, Integer langId, String composeFlag) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankMultipleChoiceQueExample bankMultipleChoiceQueExample = new BankMultipleChoiceQueExample();
        BankMultipleChoiceQueExample.Criteria criteria = bankMultipleChoiceQueExample.createCriteria();
        if (!content.equals("undefined")) {
            criteria.andMultipleContentLike("%" + content + "%");
        }
        if(langId != 0) {
            criteria.andLangIdEqualTo(langId);
        }
        if (!composeFlag.equals("undefined")) {
            criteria.andComposeFlagEqualTo(composeFlag);
        }
        bankMultipleChoiceQueExample.setOrderByClause("multiple_id asc");
        List<BankMultipleChoiceQue> bankMultipleChoiceQueList = bankMultipleChoiceQueMapper.selectByExample(bankMultipleChoiceQueExample);
        for (BankMultipleChoiceQue bankMultipleChoiceQue : bankMultipleChoiceQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankMultipleChoiceQueList.indexOf(bankMultipleChoiceQue) + 1);
            map.put("multipleId", bankMultipleChoiceQue.getMultipleId());
            Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
            map.put("content", multipleContentMap.get("content"));
            map.put("pictureSrc", multipleContentMap.get("pictureSrc"));
            map.put("choiceA", bankMultipleChoiceQue.getChoiceA());
            map.put("choiceB", bankMultipleChoiceQue.getChoiceB());
            map.put("choiceC", bankMultipleChoiceQue.getChoiceC());
            map.put("choiceD", bankMultipleChoiceQue.getChoiceD());
            map.put("choiceE", bankMultipleChoiceQue.getChoiceE());
            map.put("choiceF", bankMultipleChoiceQue.getChoiceF());
            map.put("choiceG", bankMultipleChoiceQue.getChoiceG());
            String [] answerArr = bankMultipleChoiceQue.getMultipleAnswer().split("");
            map.put("multipleAnswer", answerArr);
            map.put("answerExplain", bankMultipleChoiceQue.getAnswerExplain());
            map.put("composeFlag", bankMultipleChoiceQue.getComposeFlag());
            int allLangId = bankMultipleChoiceQue.getLangId();
            map.put("langId", allLangId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(allLangId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public int deleteMultiple(Integer multipleId) {
        int result = bankMultipleChoiceQueMapper.deleteByPrimaryKey(multipleId);
        return result;
    }

    @Override
    public int insertMultipleInfo(Map<String, Object> obj) {
        String content = (String) obj.get("content");
        String pictureSrc = (String) obj.get("pictureSrc");
        String multipleContent = content;
        if (!pictureSrc.equals("")) {
            multipleContent = content + "[[[" + pictureSrc.substring(40) + "]]]";
        }

        String choiceA = (String) obj.get("choiceA");
        String choiceB = (String) obj.get("choiceB");
        String choiceC = (String) obj.get("choiceC");
        String choiceD = (String) obj.get("choiceD");
        String choiceE = (String) obj.get("choiceE");
        String choiceF = (String) obj.get("choiceF");
        String choiceG = (String) obj.get("choiceG");
        String multipleAnswer = (String) obj.get("multipleAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankMultipleChoiceQue bankMultipleChoiceQue = new BankMultipleChoiceQue();
        bankMultipleChoiceQue.setMultipleContent(multipleContent);
        bankMultipleChoiceQue.setChoiceA(choiceA);
        bankMultipleChoiceQue.setChoiceB(choiceB);
        bankMultipleChoiceQue.setChoiceC(choiceC);
        bankMultipleChoiceQue.setChoiceD(choiceD);
        bankMultipleChoiceQue.setChoiceE(choiceE);
        bankMultipleChoiceQue.setChoiceF(choiceF);
        bankMultipleChoiceQue.setChoiceG(choiceG);
        bankMultipleChoiceQue.setMultipleAnswer(MultipleAnswersUtil.ASCIISort(multipleAnswer));
        bankMultipleChoiceQue.setAnswerExplain(answerExplain);
        bankMultipleChoiceQue.setLangId(langId);

        int result = bankMultipleChoiceQueMapper.insertSelective(bankMultipleChoiceQue);
        return result;
    }

    @Override
    public int updateMultipleInfo(Map<String, Object> obj) {
        Integer multipleId = (Integer) obj.get("multipleId");
        String content = (String) obj.get("content");
        String pictureSrc = (String) obj.get("pictureSrc");
        String multipleContent = content;
        if (!pictureSrc.equals("")) {
            multipleContent = content + "[[[" + pictureSrc.substring(40) + "]]]";
        }
        String choiceA = (String) obj.get("choiceA");
        String choiceB = (String) obj.get("choiceB");
        String choiceC = (String) obj.get("choiceC");
        String choiceD = (String) obj.get("choiceD");
        String choiceE = (String) obj.get("choiceE");
        String choiceF = (String) obj.get("choiceF");
        String choiceG = (String) obj.get("choiceG");
        String answerExplain = (String) obj.get("answerExplain");
        String multipleAnswer = (String) obj.get("multipleAnswer");
        Integer langId = (Integer) obj.get("langId");

        BankMultipleChoiceQue bankMultipleChoiceQue = new BankMultipleChoiceQue();
        bankMultipleChoiceQue.setMultipleId(multipleId);
        bankMultipleChoiceQue.setMultipleContent(multipleContent);
        bankMultipleChoiceQue.setChoiceA(choiceA);
        bankMultipleChoiceQue.setChoiceB(choiceB);
        bankMultipleChoiceQue.setChoiceC(choiceC);
        bankMultipleChoiceQue.setChoiceD(choiceD);
        bankMultipleChoiceQue.setChoiceE(choiceE);
        bankMultipleChoiceQue.setChoiceF(choiceF);
        bankMultipleChoiceQue.setChoiceG(choiceG);
        bankMultipleChoiceQue.setMultipleAnswer(MultipleAnswersUtil.ASCIISort(multipleAnswer));
        bankMultipleChoiceQue.setAnswerExplain(answerExplain);
        bankMultipleChoiceQue.setLangId(langId);

        int result = bankMultipleChoiceQueMapper.updateByPrimaryKeySelective(bankMultipleChoiceQue);
        return result;
    }

    @Override
    public int insertMultipleList(List<Map<String, Object>> multipleList) {
        int result = 0;
        for (Map<String, Object> multiple : multipleList) {
            BankMultipleChoiceQue bankMultipleChoiceQue = new BankMultipleChoiceQue();
            bankMultipleChoiceQue.setMultipleContent((String) multiple.get("multipleContent"));
            bankMultipleChoiceQue.setChoiceA((String) multiple.get("choiceA"));
            bankMultipleChoiceQue.setChoiceB((String) multiple.get("choiceB"));
            bankMultipleChoiceQue.setChoiceC((String) multiple.get("choiceC"));
            bankMultipleChoiceQue.setChoiceD((String) multiple.get("choiceD"));
            bankMultipleChoiceQue.setChoiceE((String) multiple.get("choiceE"));
            bankMultipleChoiceQue.setChoiceF((String) multiple.get("choiceF"));
            bankMultipleChoiceQue.setChoiceG((String) multiple.get("choiceG"));
            bankMultipleChoiceQue.setMultipleAnswer((String) multiple.get("multipleAnswer"));
            bankMultipleChoiceQue.setAnswerExplain((String) multiple.get("answerExplain"));
            bankMultipleChoiceQue.setLangId((Integer) multiple.get("langId"));
            result = bankMultipleChoiceQueMapper.insertSelective(bankMultipleChoiceQue);
        }
        return result;
    }

    // --------------------------------------------------------------------------------------判断题

    @Override
    public List<Map<String, Object>> getJudgeList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankJudgeQueExample bankJudgeQueExample = new BankJudgeQueExample();
        bankJudgeQueExample.setOrderByClause("judge_id asc");
        List<BankJudgeQue> bankJudgeQueList = bankJudgeQueMapper.selectByExample(bankJudgeQueExample);
        for (BankJudgeQue bankJudgeQue : bankJudgeQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankJudgeQueList.indexOf(bankJudgeQue) + 1);
            map.put("judgeId", bankJudgeQue.getJudgeId());
            map.put("content", bankJudgeQue.getJudgeContent());
            map.put("judgeAnswer", bankJudgeQue.getJudgeAnswer());
            map.put("composeFlag", bankJudgeQue.getComposeFlag());
            map.put("answerExplain", bankJudgeQue.getAnswerExplain());
            int langId = bankJudgeQue.getLangId();
            map.put("langId", langId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(langId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchJudgeList(String content, Integer langId, String composeFlag) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankJudgeQueExample bankJudgeQueExample = new BankJudgeQueExample();
        BankJudgeQueExample.Criteria criteria = bankJudgeQueExample.createCriteria();
        if (!content.equals("undefined")) {
            criteria.andJudgeContentLike("%" + content + "%");
        }
        if(langId != 0) {
            criteria.andLangIdEqualTo(langId);
        }
        if (!composeFlag.equals("undefined")) {
            criteria.andComposeFlagEqualTo(composeFlag);
        }
        bankJudgeQueExample.setOrderByClause("judge_id asc");
        List<BankJudgeQue> bankJudgeQueList = bankJudgeQueMapper.selectByExample(bankJudgeQueExample);
        for (BankJudgeQue bankJudgeQue : bankJudgeQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankJudgeQueList.indexOf(bankJudgeQue) + 1);
            map.put("judgeId", bankJudgeQue.getJudgeId());
            map.put("content", bankJudgeQue.getJudgeContent());
            map.put("composeFlag", bankJudgeQue.getComposeFlag());
            map.put("judgeAnswer", bankJudgeQue.getJudgeAnswer());
            map.put("answerExplain", bankJudgeQue.getAnswerExplain());
            int allLangId = bankJudgeQue.getLangId();
            map.put("langId", allLangId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(allLangId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public int deleteJudge(Integer judgeId) {
        int result = bankJudgeQueMapper.deleteByPrimaryKey(judgeId);
        return result;
    }

    @Override
    public int insertJudgeInfo(Map<String, Object> obj) {
        String content = (String) obj.get("content");
        String judgeAnswer = (String) obj.get("judgeAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankJudgeQue bankJudgeQue = new BankJudgeQue();
        bankJudgeQue.setJudgeContent(content);
        bankJudgeQue.setJudgeAnswer(judgeAnswer);
        bankJudgeQue.setAnswerExplain(answerExplain);
        bankJudgeQue.setLangId(langId);

        int result = bankJudgeQueMapper.insertSelective(bankJudgeQue);
        return result;
    }

    @Override
    public int updateJudgeInfo(Map<String, Object> obj) {
        Integer judgeId = (Integer) obj.get("judgeId");
        String content = (String) obj.get("content");
        String judgeAnswer = (String) obj.get("judgeAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankJudgeQue bankJudgeQue = new BankJudgeQue();
        bankJudgeQue.setJudgeId(judgeId);
        bankJudgeQue.setJudgeContent(content);
        bankJudgeQue.setJudgeAnswer(judgeAnswer);
        bankJudgeQue.setAnswerExplain(answerExplain);
        bankJudgeQue.setLangId(langId);

        int result = bankJudgeQueMapper.updateByPrimaryKeySelective(bankJudgeQue);
        return result;
    }

    @Override
    public int insertJudgeList(List<Map<String, Object>> judgeList) {
        int result = 0;
        for (Map<String, Object> judge : judgeList) {
            BankJudgeQue bankJudgeQue = new BankJudgeQue();
            bankJudgeQue.setJudgeContent((String) judge.get("judgeContent"));
            bankJudgeQue.setJudgeAnswer((String) judge.get("judgeAnswer"));
            bankJudgeQue.setAnswerExplain((String) judge.get("answerExplain"));
            bankJudgeQue.setLangId((Integer) judge.get("langId"));
            result = bankJudgeQueMapper.insertSelective(bankJudgeQue);
        }
        return result;
    }

    // --------------------------------------------------------------------------------------填空题

    @Override
    public List<Map<String, Object>> getFillList() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankFillQueExample bankFillQueExample = new BankFillQueExample();
        bankFillQueExample.setOrderByClause("fill_id asc");
        List<BankFillQue> bankFillQueList = bankFillQueMapper.selectByExample(bankFillQueExample);
        for (BankFillQue bankFillQue : bankFillQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankFillQueList.indexOf(bankFillQue) + 1);
            map.put("fillId", bankFillQue.getFillId());
            map.put("content", bankFillQue.getFillContent());
            map.put("composeFlag", bankFillQue.getComposeFlag());
            map.put("fillAnswer", bankFillQue.getFillAnswer());
            map.put("answerExplain", bankFillQue.getAnswerExplain());
            int langId = bankFillQue.getLangId();
            map.put("langId", langId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(langId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;
    }

    @Override
    public List<Map<String, Object>> searchFillList(String content, Integer langId, String composeFlag) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        BankFillQueExample bankFillQueExample = new BankFillQueExample();
        BankFillQueExample.Criteria criteria = bankFillQueExample.createCriteria();
        if (!content.equals("undefined")) {
            criteria.andFillContentLike("%" + content + "%");
        }
        if(langId != 0) {
            criteria.andLangIdEqualTo(langId);
        }
        if (!composeFlag.equals("undefined")) {
            criteria.andComposeFlagEqualTo(composeFlag);
        }
        bankFillQueExample.setOrderByClause("fill_id asc");
        List<BankFillQue> bankFillQueList = bankFillQueMapper.selectByExample(bankFillQueExample);
        for (BankFillQue bankFillQue : bankFillQueList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", bankFillQueList.indexOf(bankFillQue) + 1);
            map.put("fillId", bankFillQue.getFillId());
            map.put("content", bankFillQue.getFillContent());
            map.put("fillAnswer", bankFillQue.getFillAnswer());
            map.put("composeFlag", bankFillQue.getComposeFlag());
            map.put("answerExplain", bankFillQue.getAnswerExplain());
            int allLangId = bankFillQue.getLangId();
            map.put("langId", allLangId);
            ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(allLangId);
            map.put("langName", programingLanguage.getLangName());
            map.put("langImgSrc", programingLanguage.getLangImgSrc());
            resultList.add(map);
        }
        return resultList;

    }

    @Override
    public int deleteFill(Integer fillId) {
        int result = bankFillQueMapper.deleteByPrimaryKey(fillId);
        return result;
    }

    @Override
    public int insertFillInfo(Map<String, Object> obj) {
        String content = (String) obj.get("content");
        String fillAnswer = (String) obj.get("fillAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankFillQue bankFillQue = new BankFillQue();
        bankFillQue.setFillContent(content);
        bankFillQue.setFillAnswer(fillAnswer);
        bankFillQue.setAnswerExplain(answerExplain);
        bankFillQue.setLangId(langId);

        int result = bankFillQueMapper.insertSelective(bankFillQue);
        return result;
    }

    @Override
    public int updateFillInfo(Map<String, Object> obj) {
        Integer fillId = (Integer) obj.get("fillId");
        String content = (String) obj.get("content");
        String fillAnswer = (String) obj.get("fillAnswer");
        String answerExplain = (String) obj.get("answerExplain");
        Integer langId = (Integer) obj.get("langId");

        BankFillQue bankFillQue = new BankFillQue();
        bankFillQue.setFillId(fillId);
        bankFillQue.setFillContent(content);
        bankFillQue.setFillAnswer(fillAnswer);
        bankFillQue.setAnswerExplain(answerExplain);
        bankFillQue.setLangId(langId);

        int result = bankFillQueMapper.updateByPrimaryKeySelective(bankFillQue);
        return result;
    }

    @Override
    public int inserFillList(List<Map<String, Object>> fillList) {
        int result = 0;
        for (Map<String, Object> fill : fillList) {
            BankFillQue bankFillQue = new BankFillQue();
            bankFillQue.setFillContent((String) fill.get("fillContent"));
            bankFillQue.setFillAnswer((String) fill.get("fillAnswer"));
            bankFillQue.setAnswerExplain((String) fill.get("answerExplain"));
            bankFillQue.setLangId((Integer) fill.get("langId"));
            result = bankFillQueMapper.insertSelective(bankFillQue);
        }
        return result;
    }
}
