package com.mwt.oes.service.impl;

import com.mwt.oes.dao.*;
import com.mwt.oes.domain.*;
import com.mwt.oes.service.StudentHomeService;
import com.mwt.oes.util.FindContentWithImage;
import com.mwt.oes.util.MultipleAnswersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentHomeServiceImpl implements StudentHomeService {

    @Autowired
    StudentHomeRotationImgMapper studentHomeRotationImgMapper;
    @Autowired
    ProgramingLanguageMapper programingLanguageMapper;
    @Autowired
    PaperMapper paperMapper;
    @Autowired
    PaperQueMapper paperQueMapper;
    @Autowired
    StudentPaperScoreMapper studentPaperScoreMapper;
    @Autowired
    BankSingleChoiceQueMapper bankSingleChoiceQueMapper;
    @Autowired
    BankMultipleChoiceQueMapper bankMultipleChoiceQueMapper;
    @Autowired
    BankJudgeQueMapper bankJudgeQueMapper;
    @Autowired
    BankFillQueMapper bankFillQueMapper;
    @Autowired
    StudentPaperAnswerMapper studentPaperAnswerMapper;
    /*
        获取学生首页全部轮播图数据
     */
    @Override
    public List<StudentHomeRotationImg> getRotationImages() {
        StudentHomeRotationImgExample example = new StudentHomeRotationImgExample();
        example.setOrderByClause("img_id asc");
        List<StudentHomeRotationImg> result = studentHomeRotationImgMapper.selectByExample(example);
        return result;
    }

    /*
        获取学生首页全部编程语言信息
     */
    @Override
    public List<ProgramingLanguage> getLanguagesInfo() {
        ProgramingLanguageExample example = new ProgramingLanguageExample();
        example.setOrderByClause("lang_id asc");
        List<ProgramingLanguage> result = programingLanguageMapper.selectByExample(example);
        return result;
    }

    /*
        通过langId获取编程语言信息
     */
    @Override
    public ProgramingLanguage getLanguageInfoById(Integer langId) {
        ProgramingLanguage programingLanguage = programingLanguageMapper.selectByPrimaryKey(langId);
        return programingLanguage;
    }

    /*
        通过langId获取试卷信息
     */
    @Override
    public List<Paper> getPapersInfo(Integer langId) {
        PaperExample example = new PaperExample();
        PaperExample.Criteria criteria = example.createCriteria();
        criteria.andLangIdEqualTo(langId);
        example.setOrderByClause("paper_create_time asc");
        List<Paper> result = paperMapper.selectByExample(example);
        return result;
    }

    /*
        通过paperId获取试卷信息
     */
    @Override
    public Paper getPapersInfoByPaperId(Integer paperId) {
        Paper paper = paperMapper.selectByPrimaryKey(paperId);
        return paper;
    }

    /*
        通过paperId获取试卷问题信息
     */
    @Override
    public Map<String, Integer> getPaperQueNumByPaperId(Integer paperId) {
        PaperQueExample example = new PaperQueExample();
        PaperQueExample.Criteria criteria = example.createCriteria();
        criteria.andPaperIdEqualTo(paperId);
        int totalNum = paperQueMapper.countByExample(example);
        criteria.andQueTypeEqualTo(1);
        int singleNum = paperQueMapper.countByExample(example);

        PaperQueExample exampleMultiple = new PaperQueExample();
        PaperQueExample.Criteria criteriaMultiple = exampleMultiple.createCriteria();
        criteriaMultiple.andPaperIdEqualTo(paperId);
        criteriaMultiple.andQueTypeEqualTo(2);
        int multipleNum = paperQueMapper.countByExample(exampleMultiple);

        PaperQueExample example1Judge = new PaperQueExample();
        PaperQueExample.Criteria criteriaJudge = example1Judge.createCriteria();
        criteriaJudge.andPaperIdEqualTo(paperId);
        criteriaJudge.andQueTypeEqualTo(3);
        int judgeNum = paperQueMapper.countByExample(example1Judge);

        PaperQueExample example1Fill = new PaperQueExample();
        PaperQueExample.Criteria criteriaFill = example1Fill.createCriteria();
        criteriaFill.andPaperIdEqualTo(paperId);
        criteriaFill.andQueTypeEqualTo(4);
        int fillNum = paperQueMapper.countByExample(example1Fill);

        Map<String, Integer> result = new HashMap<>();
        result.put("totalNum",totalNum);
        result.put("singleNum",singleNum);
        result.put("multipleNum",multipleNum);
        result.put("judgeNum",judgeNum);
        result.put("fillNum",fillNum);


        return result;
    }

    /*
        初始化插入学生成绩表数据，包括考试开始时间、学号和试卷id
     */
    @Override
    public int insertStudentPaperScore(StudentPaperScore studentPaperScore) {
        int result = studentPaperScoreMapper.insertSelective(studentPaperScore);
        // 更新paper表已参加人数
        Paper paper = paperMapper.selectByPrimaryKey(studentPaperScore.getPaperId());
        int participateNum = paper.getParticipateNum() + 1;
        paper.setParticipateNum(participateNum);
        paperMapper.updateByPrimaryKeySelective(paper);
        return result;
    }

    /*
        获取试卷单选题列表信息
     */
    @Override
    public List<Map<String, Object>> getSingleQueListByPaperId(Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankSingleChoiceQue> singleChoiceQueList = bankSingleChoiceQueMapper.getSingleQueListByPaperId(paperId);
        for (BankSingleChoiceQue bankSingleChoiceQue : singleChoiceQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("singleId",bankSingleChoiceQue.getSingleId());

            Map<String, String> singleContentMap = FindContentWithImage.findContentWithImage(bankSingleChoiceQue.getSingleContent());
            map.put("singleContent",singleContentMap.get("content"));
            map.put("pictureSrc",singleContentMap.get("pictureSrc"));

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

//        System.out.println(singleChoiceQueList.get(0).getPaperQue().getQueId());

        return listResult;
    }

    /*
        获取试卷多选题列表信息
     */
    @Override
    public List<Map<String, Object>> getMultipleQueListByPaperId(Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankMultipleChoiceQue> multipleChoiceQueList = bankMultipleChoiceQueMapper.getMultipleQueListByPaperId(paperId);
        for (BankMultipleChoiceQue bankMultipleChoiceQue : multipleChoiceQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("multipleId",bankMultipleChoiceQue.getMultipleId());

            Map<String, String> multipleContentMap = FindContentWithImage.findContentWithImage(bankMultipleChoiceQue.getMultipleContent());
            map.put("multipleContent",multipleContentMap.get("content"));
            map.put("pictureSrc",multipleContentMap.get("pictureSrc"));

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
    public List<Map<String, Object>> getJudgeQueListByPaperId(Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankJudgeQue> judgeQueList = bankJudgeQueMapper.getJudgeQueListByPaperId(paperId);
        for (BankJudgeQue bankJudgeQue : judgeQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("judgeId",bankJudgeQue.getJudgeId());

            map.put("judgeContent",bankJudgeQue.getJudgeContent());

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
    public List<Map<String, Object>> getFillQueListByPaperId(Integer paperId) {
        List<Map<String, Object>> listResult = new ArrayList<>();

        List<BankFillQue> fillQueList = bankFillQueMapper.getFillQueListByPaperId(paperId);
        for (BankFillQue bankFillQue : fillQueList){
            Map<String, Object> map = new HashMap<>();

            map.put("fillId",bankFillQue.getFillId());

            map.put("fillContent",bankFillQue.getFillContent());

            listResult.add(map);
        }

        return listResult;
    }

    /*
        插入学生成绩表成绩信息和学生试卷答题记录信息
     */
    @Override
    public int insertPaperAnswerAndPaperScore(String sno, Integer paperId, List<String> singleAnswers,
                                              List<List<String>> multipleAnswers, List<String> judgeAnswers,
                                              List<String> fillAnswers, int timeUsed){

        //通过paperId获取试卷信息，主要提取单选题，多选题，判断题和填空题分数
        Paper paper = paperMapper.selectByPrimaryKey(paperId);

        //设置初始分数为0
        int score = 0;

        //计算单选题分数
        List<BankSingleChoiceQue> singleChoiceQueList = bankSingleChoiceQueMapper.getSingleQueListByPaperId(paperId);
        for (int i = 0;i < singleChoiceQueList.size();i++){
            String isCorrect = "0";
            if(singleChoiceQueList.get(i).getSingleAnswer().equals(singleAnswers.get(i))){
                score += paper.getSingleScore();
                isCorrect = "1";
            }
            StudentPaperAnswer studentPaperAnswer = new StudentPaperAnswer();
            studentPaperAnswer.setStuAnswer(singleAnswers.get(i));
            studentPaperAnswer.setIscorrect(isCorrect);
            studentPaperAnswer.setQueId(singleChoiceQueList.get(i).getPaperQue().getQueId());
            studentPaperAnswer.setPaperId(paperId);
            studentPaperAnswer.setSno(sno);
            int insertResult = studentPaperAnswerMapper.insertSelective(studentPaperAnswer);
        }

        //计算多选题分数
        List<BankMultipleChoiceQue> multipleChoiceQueList = bankMultipleChoiceQueMapper.getMultipleQueListByPaperId(paperId);
        for (int i = 0;i < multipleChoiceQueList.size();i++){
            String isCorrect = "0";

            String sbMultipleAnswers = null;
            if(multipleAnswers.get(i) != null){
                StringBuffer sb = new StringBuffer();
                for(String s : multipleAnswers.get(i)){
                    sb.append(s);
                }
                sbMultipleAnswers = MultipleAnswersUtil.ASCIISort(sb.toString());
            }
//            System.out.println(sbMultipleAnswers);

            if(multipleChoiceQueList.get(i).getMultipleAnswer().equals(sbMultipleAnswers)){
                score += paper.getMultipleScore();
                isCorrect = "1";
            }
            StudentPaperAnswer studentPaperAnswer = new StudentPaperAnswer();
            studentPaperAnswer.setStuAnswer(sbMultipleAnswers);
            studentPaperAnswer.setIscorrect(isCorrect);
            studentPaperAnswer.setQueId(multipleChoiceQueList.get(i).getPaperQue().getQueId());
            studentPaperAnswer.setPaperId(paperId);
            studentPaperAnswer.setSno(sno);
            int insertResult = studentPaperAnswerMapper.insertSelective(studentPaperAnswer);
        }

        //计算判断题分数
        List<BankJudgeQue> judgeQueList = bankJudgeQueMapper.getJudgeQueListByPaperId(paperId);
        for (int i = 0;i < judgeQueList.size();i++){
            String isCorrect = "0";
            if(judgeQueList.get(i).getJudgeAnswer().equals(judgeAnswers.get(i))){
                score += paper.getJudgeScore();
                isCorrect = "1";
            }
            StudentPaperAnswer studentPaperAnswer = new StudentPaperAnswer();
            studentPaperAnswer.setStuAnswer(judgeAnswers.get(i));
            studentPaperAnswer.setIscorrect(isCorrect);
            studentPaperAnswer.setQueId(judgeQueList.get(i).getPaperQue().getQueId());
            studentPaperAnswer.setPaperId(paperId);
            studentPaperAnswer.setSno(sno);
            int insertResult = studentPaperAnswerMapper.insertSelective(studentPaperAnswer);
        }

        //计算填空题分数
        List<BankFillQue> fillQueList = bankFillQueMapper.getFillQueListByPaperId(paperId);
        for (int i = 0;i < fillQueList.size();i++){
            String isCorrect = "0";
            if(fillAnswers.get(i) != null){
                if(fillQueList.get(i).getFillAnswer().equalsIgnoreCase(fillAnswers.get(i).trim())){
//                    System.out.println("T" + fillQueList.get(i).getFillAnswer());
//                    System.out.println("dd" + fillAnswers.get(i));
                    score += paper.getFillScore();
                    isCorrect = "1";
                }
            }
            StudentPaperAnswer studentPaperAnswer = new StudentPaperAnswer();
            studentPaperAnswer.setStuAnswer(fillAnswers.get(i));
            studentPaperAnswer.setIscorrect(isCorrect);
            studentPaperAnswer.setQueId(fillQueList.get(i).getPaperQue().getQueId());
            studentPaperAnswer.setPaperId(paperId);
            studentPaperAnswer.setSno(sno);
            int insertResult = studentPaperAnswerMapper.insertSelective(studentPaperAnswer);
        }

        //更新学生成绩表数据
        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andPaperIdEqualTo(paperId);
        StudentPaperScore studentPaperScore = new StudentPaperScore();
        studentPaperScore.setScore(score);
        studentPaperScore.setTimeUsed(timeUsed);
        studentPaperScore.setEndTime(new Date());
        int updateResult = studentPaperScoreMapper.updateByExampleSelective(studentPaperScore, studentPaperScoreExample);
        return updateResult;
    }

    /*
        请求获取当前试卷状态，即是否已完成
    */
    public List<StudentPaperScore> getCurrentPaperStatus(String sno, Integer paperId){
        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        criteria.andPaperIdEqualTo(paperId);
        List<StudentPaperScore> listResult = studentPaperScoreMapper.selectByExample(studentPaperScoreExample);
        return listResult;
    }

    /*
        请求获取当前试卷的成绩报告
    */
    public Map<String, Object> getScoreReport(String sno, Integer paperId){

        List<StudentPaperScore> listResult = getCurrentPaperStatus(sno, paperId);
        StudentPaperScore studentPaperScore = listResult.get(0);
        Paper paper = paperMapper.selectByPrimaryKey(paperId);
        Map<String, Integer> queNum = getPaperQueNumByPaperId(paperId);

        Map<String, Object> map = new HashMap<>();

        int totalScore = queNum.get("singleNum")*paper.getSingleScore() + queNum.get("multipleNum")*paper.getMultipleScore()
                + queNum.get("judgeNum")*paper.getJudgeScore() + queNum.get("fillNum")*paper.getFillScore();
        map.put("totalScore",totalScore);

        List<Map<String, Object>> chartDataRingScore = new ArrayList<>();

        List<Map<String, Object>> chartDataBarCorrect = new ArrayList<>();
        StudentPaperAnswer studentPaperAnswerCorrect = new StudentPaperAnswer();
        studentPaperAnswerCorrect.setSno(sno);
        studentPaperAnswerCorrect.setPaperId(paperId);
        Map<String, Object> singleCorrectMap = new HashMap<>();
        singleCorrectMap.put("name","单选题" + queNum.get("singleNum") + "道");
        singleCorrectMap.put("value",studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect));
        chartDataBarCorrect.add(singleCorrectMap);

        //单选题得分情况
        Map<String, Object> singleScoreMap = new HashMap<>();
        singleScoreMap.put("name","单选题");
        singleScoreMap.put("value",studentPaperAnswerMapper.selectSingleCorrectCount(studentPaperAnswerCorrect)*paper.getSingleScore());
        chartDataRingScore.add(singleScoreMap);

        Map<String, Object> multipleCorrectMap = new HashMap<>();
        multipleCorrectMap.put("name","多选题" + queNum.get("multipleNum") + "道");
        multipleCorrectMap.put("value",studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect));
        chartDataBarCorrect.add(multipleCorrectMap);

        //多选题得分情况
        Map<String, Object> multipleScoreMap = new HashMap<>();
        multipleScoreMap.put("name","多选题");
        multipleScoreMap.put("value",studentPaperAnswerMapper.selectMultipleCorrectCount(studentPaperAnswerCorrect)*paper.getMultipleScore());
        chartDataRingScore.add(multipleScoreMap);

        Map<String, Object> judgeCorrectMap = new HashMap<>();
        judgeCorrectMap.put("name","判断题" + queNum.get("judgeNum") + "道");
        judgeCorrectMap.put("value",studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect));
        chartDataBarCorrect.add(judgeCorrectMap);

        //判断题得分情况
        Map<String, Object> judgeScoreMap = new HashMap<>();
        judgeScoreMap.put("name","判断题");
        judgeScoreMap.put("value",studentPaperAnswerMapper.selectJudgeCorrectCount(studentPaperAnswerCorrect)*paper.getJudgeScore());
        chartDataRingScore.add(judgeScoreMap);

        Map<String, Object> fillCorrectMap = new HashMap<>();
        fillCorrectMap.put("name","填空题" + queNum.get("fillNum") + "道");
        fillCorrectMap.put("value",studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect));
        chartDataBarCorrect.add(fillCorrectMap);

        //判断题得分情况
        Map<String, Object> fillScoreMap = new HashMap<>();
        fillScoreMap.put("name","填空题");
        fillScoreMap.put("value",studentPaperAnswerMapper.selectFillCorrectCount(studentPaperAnswerCorrect)*paper.getFillScore());
        chartDataRingScore.add(fillScoreMap);

        //该试卷成绩排行结果
        List<Map<String, Object>> chartDataLineRanking = new ArrayList<>();
        StudentPaperScoreExample studentPaperScoreExample = new StudentPaperScoreExample();
        StudentPaperScoreExample.Criteria criteria = studentPaperScoreExample.createCriteria();
        criteria.andPaperIdEqualTo(paperId);
        studentPaperScoreExample.setOrderByClause("score asc");
        List<StudentPaperScore> allScoreListResult = studentPaperScoreMapper.selectByExample(studentPaperScoreExample);
        for (StudentPaperScore studentPaperScore1 : allScoreListResult){
            Map<String, Object> studentScoreMap = new HashMap<>();
            if(studentPaperScore1.getSno().equals(sno)){
                studentScoreMap.put("name","我");
                if(studentPaperScore1.getScore() == null){
                    studentScoreMap.put("value",0);
                }
                else {
                    studentScoreMap.put("value",studentPaperScore1.getScore());
                }
            }
            else {
                studentScoreMap.put("name","");
                if(studentPaperScore1.getScore() == null){
                    studentScoreMap.put("value",0);
                }
                else {
                    studentScoreMap.put("value",studentPaperScore1.getScore());
                }
            }
            chartDataLineRanking.add(studentScoreMap);
        }

        //花费时间和考试时长
        List<Map<String, Object>> chartDataPieTime = new ArrayList<>();
        Map<String, Object> usedTimeMap = new HashMap<>();
        usedTimeMap.put("name","花费时间(秒)");
        usedTimeMap.put("value",(studentPaperScore.getTimeUsed())/1000);
        chartDataPieTime.add(usedTimeMap);
        Map<String, Object> paperDurationMap = new HashMap<>();
        paperDurationMap.put("name","考试时长(秒)");
        paperDurationMap.put("value",paper.getPaperDuration());
        chartDataPieTime.add(paperDurationMap);

        map.put("paperInfo",paper);
        map.put("chartDataRingScore",chartDataRingScore);
        map.put("chartDataBarCorrect",chartDataBarCorrect);
        map.put("chartDataLineRanking",chartDataLineRanking);
        map.put("chartDataPieTime",chartDataPieTime);

        return map;
    }
}
