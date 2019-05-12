package com.mwt.oes.service.impl;

import com.mwt.oes.dao.*;
import com.mwt.oes.domain.*;
import com.mwt.oes.service.StudentHomeService;
import com.mwt.oes.service.StudentWrongService;
import com.mwt.oes.util.FindContentWithImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentWrongServiceImpl implements StudentWrongService {

    @Autowired
    StudentPaperScoreMapper studentPaperScoreMapper;
    @Autowired
    PaperMapper paperMapper;
    @Autowired
    StudentPaperAnswerMapper studentPaperAnswerMapper;
    @Autowired
    StudentHomeService studentHomeService;
    @Autowired
    BankSingleChoiceQueMapper bankSingleChoiceQueMapper;
    @Autowired
    BankMultipleChoiceQueMapper bankMultipleChoiceQueMapper;
    @Autowired
    BankJudgeQueMapper bankJudgeQueMapper;
    @Autowired
    BankFillQueMapper bankFillQueMapper;
    @Autowired
    PaperQueMapper paperQueMapper;

    /*
        获取全部错题试卷信息
     */
    @Override
    public List<Map<String, Object>> getWrongAllPapers(String sno) {

        List<Map<String, Object>> resultList = new ArrayList<>();

        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        studentPaperScoreExample.setOrderByClause("start_time desc");
        List<StudentPaperScore> studentPaperScoreList = studentPaperScoreMapper.selectByExample(studentPaperScoreExample);
        for (StudentPaperScore studentPaperScore : studentPaperScoreList) {
            Map<String, Object> map = new HashMap<>();
            map.put("score", studentPaperScore.getScore());
            Paper paper = paperMapper.selectByPrimaryKey(studentPaperScore.getPaperId());
            map.put("paperId",paper.getPaperId());
            map.put("paperName",paper.getPaperName());
            map.put("paperDifficulty",paper.getPaperDifficulty());
            map.put("paperType",paper.getPaperType());
            map.put("singleScore",paper.getSingleScore());
            map.put("multipleScore",paper.getMultipleScore());
            map.put("judgeScore",paper.getJudgeScore());
            map.put("fillScore",paper.getFillScore());

            Map<String, Integer> queNum = studentHomeService.getPaperQueNumByPaperId(studentPaperScore.getPaperId());
            map.put("singleNum",queNum.get("singleNum"));
            map.put("multipleNum",queNum.get("multipleNum"));
            map.put("judgeNum",queNum.get("judgeNum"));
            map.put("fillNum",queNum.get("fillNum"));
            map.put("totalNum",queNum.get("totalNum"));

            StudentPaperAnswer studentPaperAnswerCorrect = new StudentPaperAnswer();
            studentPaperAnswerCorrect.setSno(sno);
            studentPaperAnswerCorrect.setPaperId(paper.getPaperId());
            map.put("singleErrorNum",queNum.get("singleNum") - studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect));
            map.put("multipleErrorNum",queNum.get("multipleNum") - studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect));
            map.put("judgeErrorNum",queNum.get("judgeNum")- studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect));
            map.put("fillErrorNum",queNum.get("fillNum") - studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect));
            map.put("totalErrorNum",queNum.get("totalNum") - (studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect)
                    + studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect)
                    + studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect)
                    + studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect)));
            resultList.add(map);
        }

        return resultList;
    }

    @Override
    public List<Map<String, Object>> getWrongPapersByLangId(String sno, Integer langId) {

        List<Map<String, Object>> resultList = new ArrayList<>();

        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        studentPaperScoreExample.setOrderByClause("start_time desc");
        List<StudentPaperScore> studentPaperScoreList = studentPaperScoreMapper.selectByExample(studentPaperScoreExample);
        for (StudentPaperScore studentPaperScore : studentPaperScoreList) {
            Paper paper = paperMapper.selectByPrimaryKey(studentPaperScore.getPaperId());
            if(paper.getLangId().equals(langId)){
                Map<String, Object> map = new HashMap<>();
                map.put("score", studentPaperScore.getScore());
                map.put("paperId",paper.getPaperId());
                map.put("paperName",paper.getPaperName());
                map.put("paperDifficulty",paper.getPaperDifficulty());
                map.put("paperType",paper.getPaperType());
                map.put("singleScore",paper.getSingleScore());
                map.put("multipleScore",paper.getMultipleScore());
                map.put("judgeScore",paper.getJudgeScore());
                map.put("fillScore",paper.getFillScore());

                Map<String, Integer> queNum = studentHomeService.getPaperQueNumByPaperId(studentPaperScore.getPaperId());
                map.put("singleNum",queNum.get("singleNum"));
                map.put("multipleNum",queNum.get("multipleNum"));
                map.put("judgeNum",queNum.get("judgeNum"));
                map.put("fillNum",queNum.get("fillNum"));
                map.put("totalNum",queNum.get("totalNum"));

                StudentPaperAnswer studentPaperAnswerCorrect = new StudentPaperAnswer();
                studentPaperAnswerCorrect.setSno(sno);
                studentPaperAnswerCorrect.setPaperId(paper.getPaperId());
                map.put("singleErrorNum",queNum.get("singleNum") - studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect));
                map.put("multipleErrorNum",queNum.get("multipleNum") - studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect));
                map.put("judgeErrorNum",queNum.get("judgeNum")- studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect));
                map.put("fillErrorNum",queNum.get("fillNum") - studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect));
                map.put("totalErrorNum",queNum.get("totalNum") - (studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect)
                        + studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect)
                        + studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect)
                        + studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect)));
                resultList.add(map);
            }
        }

        return resultList;
    }

    /*
        获取试卷单选题列表信息
    */
    @Override
    public List<Map<String, Object>> getSingleQueListByWrongPaperId(String sno, Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankSingleChoiceQue> singleChoiceQueList = bankSingleChoiceQueMapper.getSingleQueListByPaperId(paperId);
        for (BankSingleChoiceQue bankSingleChoiceQue : singleChoiceQueList){
            Map<String, Object> map = new HashMap<>();

            //获取单选题id
            map.put("singleId",bankSingleChoiceQue.getSingleId());

            //通过singleId获取paperQue对象
            PaperQueExample paperQueExample = new PaperQueExample();
            PaperQueExample.Criteria criteria = paperQueExample.createCriteria();
            criteria.andSingleIdEqualTo(bankSingleChoiceQue.getSingleId());
            List<PaperQue> paperQueList = paperQueMapper.selectByExample(paperQueExample);
            PaperQue paperQue = paperQueList.get(0);
            map.put("queType",paperQue.getQueType());
            Integer queId = paperQue.getQueId();

            //通过queId获取试卷答案信息
            StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
            StudentPaperAnswerExample.Criteria criteria1 = studentPaperAnswerExample.createCriteria();
            criteria1.andQueIdEqualTo(queId);
            criteria1.andSnoEqualTo(sno);
            List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
            StudentPaperAnswer studentPaperAnswer = studentPaperAnswerList.get(0);
            map.put("answerId",studentPaperAnswer.getAnswerId());
            map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
            map.put("isCollect",studentPaperAnswer.getIscollect());
            map.put("isCorrect",studentPaperAnswer.getIscorrect());

            //获取单选题题目内容
            Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
            map.put("singleContent",singleContentMap.get("content"));
            map.put("pictureSrc",singleContentMap.get("pictureSrc"));

            //获取单选题答案
            map.put("singleAnswer",bankSingleChoiceQue.getSingleAnswer());

            map.put("explain",bankSingleChoiceQue.getAnswerExplain());

            //获取单选题选项数组
            List<Map<String, String>> optionsList = new ArrayList<>();
            Map<String, String> optionA = new HashMap<>();
            optionA.put("label",bankSingleChoiceQue.getChoiceA());
            optionA.put("value","A");
            optionsList.add(optionA);
            Map<String, String> optionB = new HashMap<>();
            optionB.put("label",bankSingleChoiceQue.getChoiceB());
            optionB.put("value","B");
            optionsList.add(optionB);
            Map<String, String> optionC = new HashMap<>();
            optionC.put("label",bankSingleChoiceQue.getChoiceC());
            optionC.put("value","C");
            optionsList.add(optionC);
            Map<String, String> optionD = new HashMap<>();
            optionD.put("label",bankSingleChoiceQue.getChoiceD());
            optionD.put("value","D");
            optionsList.add(optionD);
            Map<String, String> optionE = new HashMap<>();
            optionE.put("label",bankSingleChoiceQue.getChoiceE());
            optionE.put("value","E");
            optionsList.add(optionE);
            Map<String, String> optionF = new HashMap<>();
            optionF.put("label",bankSingleChoiceQue.getChoiceF());
            optionF.put("value","F");
            optionsList.add(optionF);
            Map<String, String> optionG = new HashMap<>();
            optionG.put("label",bankSingleChoiceQue.getChoiceG());
            optionG.put("value","G");
            optionsList.add(optionG);
            map.put("options",optionsList);

            listResult.add(map);
        }

        return listResult;
    }

    /*
        获取试卷多选题列表信息
     */
    @Override
    public List<Map<String, Object>> getMultipleQueListByWrongPaperId(String sno, Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankMultipleChoiceQue> multipleChoiceQueList = bankMultipleChoiceQueMapper.getMultipleQueListByPaperId(paperId);
        for (BankMultipleChoiceQue bankMultipleChoiceQue : multipleChoiceQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("multipleId",bankMultipleChoiceQue.getMultipleId());

            //通过multipleId获取paperQue对象
            PaperQueExample paperQueExample = new PaperQueExample();
            PaperQueExample.Criteria criteria = paperQueExample.createCriteria();
            criteria.andMultipleIdEqualTo(bankMultipleChoiceQue.getMultipleId());
            List<PaperQue> paperQueList = paperQueMapper.selectByExample(paperQueExample);
            PaperQue paperQue = paperQueList.get(0);
            map.put("queType",paperQue.getQueType());
            Integer queId = paperQue.getQueId();

            //通过queId获取试卷答案信息
            StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
            StudentPaperAnswerExample.Criteria criteria1 = studentPaperAnswerExample.createCriteria();
            criteria1.andQueIdEqualTo(queId);
            criteria1.andSnoEqualTo(sno);
            List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
            StudentPaperAnswer studentPaperAnswer = studentPaperAnswerList.get(0);
            map.put("answerId",studentPaperAnswer.getAnswerId());
            map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
            map.put("isCollect",studentPaperAnswer.getIscollect());
            map.put("isCorrect",studentPaperAnswer.getIscorrect());

            Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
            map.put("multipleContent",multipleContentMap.get("content"));
            map.put("pictureSrc",multipleContentMap.get("pictureSrc"));

            map.put("multipleAnswer",bankMultipleChoiceQue.getMultipleAnswer());

            String [] answerArr = bankMultipleChoiceQue.getMultipleAnswer().split("");
            map.put("multipleAnswerArray", answerArr);

            map.put("explain",bankMultipleChoiceQue.getAnswerExplain());

            List<Map<String, String>> optionsList = new ArrayList<>();

            Map<String, String> optionA = new HashMap<>();
            optionA.put("label",bankMultipleChoiceQue.getChoiceA());
            optionA.put("value","A");
            optionsList.add(optionA);

            Map<String, String> optionB = new HashMap<>();
            optionB.put("label",bankMultipleChoiceQue.getChoiceB());
            optionB.put("value","B");
            optionsList.add(optionB);

            Map<String, String> optionC = new HashMap<>();
            optionC.put("label",bankMultipleChoiceQue.getChoiceC());
            optionC.put("value","C");
            optionsList.add(optionC);

            Map<String, String> optionD = new HashMap<>();
            optionD.put("label",bankMultipleChoiceQue.getChoiceD());
            optionD.put("value","D");
            optionsList.add(optionD);

            Map<String, String> optionE = new HashMap<>();
            optionE.put("label",bankMultipleChoiceQue.getChoiceE());
            optionE.put("value","E");
            optionsList.add(optionE);

            Map<String, String> optionF = new HashMap<>();
            optionF.put("label",bankMultipleChoiceQue.getChoiceF());
            optionF.put("value","F");
            optionsList.add(optionF);

            Map<String, String> optionG = new HashMap<>();
            optionG.put("label",bankMultipleChoiceQue.getChoiceG());
            optionG.put("value","G");
            optionsList.add(optionG);
            map.put("options",optionsList);

            listResult.add(map);
        }

        return listResult;
    }

    /*
        获取试卷判断题列表信息
     */
    @Override
    public List<Map<String, Object>> getJudgeQueListByWrongPaperId(String sno, Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankJudgeQue> judgeQueList = bankJudgeQueMapper.getJudgeQueListByPaperId(paperId);
        for (BankJudgeQue bankJudgeQue : judgeQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("judgeId",bankJudgeQue.getJudgeId());

            //通过judgeId获取paperQue对象
            PaperQueExample paperQueExample = new PaperQueExample();
            PaperQueExample.Criteria criteria = paperQueExample.createCriteria();
            criteria.andJudgeIdEqualTo(bankJudgeQue.getJudgeId());
            List<PaperQue> paperQueList = paperQueMapper.selectByExample(paperQueExample);
            PaperQue paperQue = paperQueList.get(0);
            map.put("queType",paperQue.getQueType());
            Integer queId = paperQue.getQueId();

            //通过queId获取试卷答案信息
            StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
            StudentPaperAnswerExample.Criteria criteria1 = studentPaperAnswerExample.createCriteria();
            criteria1.andQueIdEqualTo(queId);
            criteria1.andSnoEqualTo(sno);
            List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
            StudentPaperAnswer studentPaperAnswer = studentPaperAnswerList.get(0);
            map.put("answerId",studentPaperAnswer.getAnswerId());
            map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
            map.put("isCollect",studentPaperAnswer.getIscollect());
            map.put("isCorrect",studentPaperAnswer.getIscorrect());

            map.put("judgeContent",bankJudgeQue.getJudgeContent());

            map.put("judgeAnswer",bankJudgeQue.getJudgeAnswer());

            map.put("explain",bankJudgeQue.getAnswerExplain());

            List<Map<String, String>> optionsList = new ArrayList<>();

            Map<String, String> optionT = new HashMap<>();
            optionT.put("label","正确");
            optionT.put("value","T");
            optionsList.add(optionT);

            Map<String, String> optionF = new HashMap<>();
            optionF.put("label","错误");
            optionF.put("value","F");
            optionsList.add(optionF);

            map.put("options",optionsList);

            listResult.add(map);
        }

        return listResult;
    }

    /*
        获取试卷填空题列表信息
     */
    @Override
    public List<Map<String, Object>> getFillQueListByWrongPaperId(String sno, Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankFillQue> fillQueList = bankFillQueMapper.getFillQueListByPaperId(paperId);
        for (BankFillQue bankFillQue : fillQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("fillId",bankFillQue.getFillId());

            //通过fillId获取paperQue对象
            PaperQueExample paperQueExample = new PaperQueExample();
            PaperQueExample.Criteria criteria = paperQueExample.createCriteria();
            criteria.andFillIdEqualTo(bankFillQue.getFillId());
            List<PaperQue> paperQueList = paperQueMapper.selectByExample(paperQueExample);
            PaperQue paperQue = paperQueList.get(0);
            map.put("queType",paperQue.getQueType());
            Integer queId = paperQue.getQueId();

            //通过queId获取试卷答案信息
            StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
            StudentPaperAnswerExample.Criteria criteria1 = studentPaperAnswerExample.createCriteria();
            criteria1.andQueIdEqualTo(queId);
            criteria1.andSnoEqualTo(sno);
            List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
            StudentPaperAnswer studentPaperAnswer = studentPaperAnswerList.get(0);
            map.put("answerId",studentPaperAnswer.getAnswerId());
            map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
            map.put("isCollect",studentPaperAnswer.getIscollect());
            map.put("isCorrect",studentPaperAnswer.getIscorrect());

            map.put("fillContent",bankFillQue.getFillContent());

            map.put("fillAnswer",bankFillQue.getFillAnswer());

            map.put("explain",bankFillQue.getAnswerExplain());

            listResult.add(map);
        }

        return listResult;
    }

    /*
        请求根据answerId更新学生试卷答案表isCollect字段
     */
    @Override
    public int updatePaperAnswerIsCollect(StudentPaperAnswer studentPaperAnswer){
        int result = studentPaperAnswerMapper.updateByPrimaryKeySelective(studentPaperAnswer);
        return result;
    }

    /*
       获取全部收藏题目
    */
    @Override
    public List<Map<String, Object>> getAllCollections(String sno) {
        List<Map<String, Object>> resultList = new ArrayList<>();

        StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
        StudentPaperAnswerExample.Criteria criteria = studentPaperAnswerExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andIscollectEqualTo("1");
        List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
        for (StudentPaperAnswer studentPaperAnswer : studentPaperAnswerList){
            Map<String, Object> map = new HashMap<>();
            Integer queId = studentPaperAnswer.getQueId();
            //存储答案id
            map.put("answerId",studentPaperAnswer.getAnswerId());
            PaperQue paperQue = paperQueMapper.selectByPrimaryKey(queId);
            //存储题目类型
            map.put("queType",paperQue.getQueType());
            if(paperQue.getQueType() == 1){
                BankSingleChoiceQue bankSingleChoiceQue = bankSingleChoiceQueMapper.selectByPrimaryKey(paperQue.getSingleId());
                Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
                map.put("content",singleContentMap.get("content"));
            }
            if (paperQue.getQueType() == 2){
                BankMultipleChoiceQue bankMultipleChoiceQue = bankMultipleChoiceQueMapper.selectByPrimaryKey(paperQue.getMultipleId());
                Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
                map.put("content",multipleContentMap.get("content"));
            }
            if(paperQue.getQueType() == 3){
                BankJudgeQue bankJudgeQue = bankJudgeQueMapper.selectByPrimaryKey(paperQue.getJudgeId());
                map.put("content",bankJudgeQue.getJudgeContent());
            }
            if(paperQue.getQueType() == 4){
                BankFillQue bankFillQue = bankFillQueMapper.selectByPrimaryKey(paperQue.getFillId());
                map.put("content",bankFillQue.getFillContent());
            }
            resultList.add(map);
        }

        return resultList;
    }

    /*
       通过题目类型id获取收藏题目
    */
    @Override
    public List<Map<String, Object>> getCollectionsById(String sno, Integer queType) {
        List<Map<String, Object>> resultList = new ArrayList<>();

        StudentPaperAnswerExample studentPaperAnswerExample = new StudentPaperAnswerExample();
        StudentPaperAnswerExample.Criteria criteria = studentPaperAnswerExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andIscollectEqualTo("1");
        List<StudentPaperAnswer> studentPaperAnswerList = studentPaperAnswerMapper.selectByExample(studentPaperAnswerExample);
        for (StudentPaperAnswer studentPaperAnswer : studentPaperAnswerList){
            Map<String, Object> map = new HashMap<>();
            Integer queId = studentPaperAnswer.getQueId();

            PaperQueExample paperQueExample = new PaperQueExample();
            PaperQueExample.Criteria criteria1 = paperQueExample.createCriteria();
            criteria1.andQueIdEqualTo(queId);
            criteria1.andQueTypeEqualTo(queType);
            List<PaperQue> paperQueList = paperQueMapper.selectByExample(paperQueExample);
            for (PaperQue paperQue : paperQueList){
                if(paperQue.getQueType() == 1){
                    map.put("queType",queType);
                    //存储答案id
                    map.put("answerId",studentPaperAnswer.getAnswerId());
                    BankSingleChoiceQue bankSingleChoiceQue = bankSingleChoiceQueMapper.selectByPrimaryKey(paperQue.getSingleId());
                    Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
                    map.put("content",singleContentMap.get("content"));
                }
                if (paperQue.getQueType() == 2){
                    map.put("queType",queType);
                    //存储答案id
                    map.put("answerId",studentPaperAnswer.getAnswerId());
                    BankMultipleChoiceQue bankMultipleChoiceQue = bankMultipleChoiceQueMapper.selectByPrimaryKey(paperQue.getMultipleId());
                    Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
                    map.put("content",multipleContentMap.get("content"));
                }
                if(paperQue.getQueType() == 3){
                    map.put("queType",queType);
                    //存储答案id
                    map.put("answerId",studentPaperAnswer.getAnswerId());
                    BankJudgeQue bankJudgeQue = bankJudgeQueMapper.selectByPrimaryKey(paperQue.getJudgeId());
                    map.put("content",bankJudgeQue.getJudgeContent());
                }
                if(paperQue.getQueType() == 4){
                    map.put("queType",queType);
                    //存储答案id
                    map.put("answerId",studentPaperAnswer.getAnswerId());
                    BankFillQue bankFillQue = bankFillQueMapper.selectByPrimaryKey(paperQue.getFillId());
                    map.put("content",bankFillQue.getFillContent());
                }
                resultList.add(map);
            }
        }

        return resultList;
    }

    /*
        通过answerId获取收藏单选题信息
    */
    public Map<String, Object> getSingleByAnswerId(Integer answerId){
        Map<String, Object> map = new HashMap<>();
        StudentPaperAnswer studentPaperAnswer = studentPaperAnswerMapper.selectByPrimaryKey(answerId);
        map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
        map.put("isCorrect",studentPaperAnswer.getIscorrect());
        map.put("isCollect",studentPaperAnswer.getIscollect());

        PaperQue paperQue = paperQueMapper.selectByPrimaryKey(studentPaperAnswer.getQueId());

        BankSingleChoiceQue bankSingleChoiceQue = bankSingleChoiceQueMapper.selectByPrimaryKey(paperQue.getSingleId());
        Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
        map.put("singleContent",singleContentMap.get("content"));
        map.put("pictureSrc",singleContentMap.get("pictureSrc"));
        map.put("singleAnswer",bankSingleChoiceQue.getSingleAnswer());
        map.put("answerExplain",bankSingleChoiceQue.getAnswerExplain());

        //获取单选题选项数组
        List<Map<String, String>> optionsList = new ArrayList<>();
        Map<String, String> optionA = new HashMap<>();
        optionA.put("label",bankSingleChoiceQue.getChoiceA());
        optionA.put("value","A");
        optionsList.add(optionA);
        Map<String, String> optionB = new HashMap<>();
        optionB.put("label",bankSingleChoiceQue.getChoiceB());
        optionB.put("value","B");
        optionsList.add(optionB);
        Map<String, String> optionC = new HashMap<>();
        optionC.put("label",bankSingleChoiceQue.getChoiceC());
        optionC.put("value","C");
        optionsList.add(optionC);
        Map<String, String> optionD = new HashMap<>();
        optionD.put("label",bankSingleChoiceQue.getChoiceD());
        optionD.put("value","D");
        optionsList.add(optionD);
        Map<String, String> optionE = new HashMap<>();
        optionE.put("label",bankSingleChoiceQue.getChoiceE());
        optionE.put("value","E");
        optionsList.add(optionE);
        Map<String, String> optionF = new HashMap<>();
        optionF.put("label",bankSingleChoiceQue.getChoiceF());
        optionF.put("value","F");
        optionsList.add(optionF);
        Map<String, String> optionG = new HashMap<>();
        optionG.put("label",bankSingleChoiceQue.getChoiceG());
        optionG.put("value","G");
        optionsList.add(optionG);
        map.put("options",optionsList);

        return map;
    }
    /*
        通过answerId获取收藏多选题信息
    */
    public Map<String, Object> getMultipleByAnswerId(Integer answerId){
        Map<String, Object> map = new HashMap<>();
        StudentPaperAnswer studentPaperAnswer = studentPaperAnswerMapper.selectByPrimaryKey(answerId);
        map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
        map.put("isCorrect",studentPaperAnswer.getIscorrect());
        map.put("isCollect",studentPaperAnswer.getIscollect());

        PaperQue paperQue = paperQueMapper.selectByPrimaryKey(studentPaperAnswer.getQueId());

        BankMultipleChoiceQue bankMultipleChoiceQue = bankMultipleChoiceQueMapper.selectByPrimaryKey(paperQue.getMultipleId());
        Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
        map.put("multipleContent",multipleContentMap.get("content"));
        map.put("pictureSrc",multipleContentMap.get("pictureSrc"));
        map.put("multipleAnswer",bankMultipleChoiceQue.getMultipleAnswer());
        String [] answerArr = bankMultipleChoiceQue.getMultipleAnswer().split("");
        map.put("multipleAnswerArray", answerArr);
        map.put("answerExplain",bankMultipleChoiceQue.getAnswerExplain());

        List<Map<String, String>> optionsList = new ArrayList<>();
        Map<String, String> optionA = new HashMap<>();
        optionA.put("label",bankMultipleChoiceQue.getChoiceA());
        optionA.put("value","A");
        optionsList.add(optionA);
        Map<String, String> optionB = new HashMap<>();
        optionB.put("label",bankMultipleChoiceQue.getChoiceB());
        optionB.put("value","B");
        optionsList.add(optionB);
        Map<String, String> optionC = new HashMap<>();
        optionC.put("label",bankMultipleChoiceQue.getChoiceC());
        optionC.put("value","C");
        optionsList.add(optionC);
        Map<String, String> optionD = new HashMap<>();
        optionD.put("label",bankMultipleChoiceQue.getChoiceD());
        optionD.put("value","D");
        optionsList.add(optionD);
        Map<String, String> optionE = new HashMap<>();
        optionE.put("label",bankMultipleChoiceQue.getChoiceE());
        optionE.put("value","E");
        optionsList.add(optionE);
        Map<String, String> optionF = new HashMap<>();
        optionF.put("label",bankMultipleChoiceQue.getChoiceF());
        optionF.put("value","F");
        optionsList.add(optionF);
        Map<String, String> optionG = new HashMap<>();
        optionG.put("label",bankMultipleChoiceQue.getChoiceG());
        optionG.put("value","G");
        optionsList.add(optionG);
        map.put("options",optionsList);

        return map;
    }
    /*
        通过answerId获取收藏判断题信息
    */
    public Map<String, Object> getJudgeByAnswerId(Integer answerId){
        Map<String, Object> map = new HashMap<>();

        StudentPaperAnswer studentPaperAnswer = studentPaperAnswerMapper.selectByPrimaryKey(answerId);
        map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
        map.put("isCorrect",studentPaperAnswer.getIscorrect());
        map.put("isCollect",studentPaperAnswer.getIscollect());

        PaperQue paperQue = paperQueMapper.selectByPrimaryKey(studentPaperAnswer.getQueId());

        BankJudgeQue bankJudgeQue = bankJudgeQueMapper.selectByPrimaryKey(paperQue.getJudgeId());
        map.put("judgeContent",bankJudgeQue.getJudgeContent());
        map.put("judgeAnswer",bankJudgeQue.getJudgeAnswer());
        map.put("answerExplain",bankJudgeQue.getAnswerExplain());

        List<Map<String, String>> optionsList = new ArrayList<>();
        Map<String, String> optionT = new HashMap<>();
        optionT.put("label","正确");
        optionT.put("value","T");
        optionsList.add(optionT);
        Map<String, String> optionF = new HashMap<>();
        optionF.put("label","错误");
        optionF.put("value","F");
        optionsList.add(optionF);
        map.put("options",optionsList);

        return map;
    }
    /*
        通过answerId获取收藏填空题信息
    */
    public Map<String, Object> getFillByAnswerId(Integer answerId){
        Map<String, Object> map = new HashMap<>();

        StudentPaperAnswer studentPaperAnswer = studentPaperAnswerMapper.selectByPrimaryKey(answerId);
        map.put("stuAnswer",studentPaperAnswer.getStuAnswer());
        map.put("isCorrect",studentPaperAnswer.getIscorrect());
        map.put("isCollect",studentPaperAnswer.getIscollect());

        PaperQue paperQue = paperQueMapper.selectByPrimaryKey(studentPaperAnswer.getQueId());

        BankFillQue bankFillQue = bankFillQueMapper.selectByPrimaryKey(paperQue.getFillId());

        map.put("fillContent",bankFillQue.getFillContent());
        map.put("fillAnswer",bankFillQue.getFillAnswer());
        map.put("answerExplain",bankFillQue.getAnswerExplain());

        return map;
    }
}
