package com.dennis.api.common;

public class UtilServiceImpl implements UtilService {
    private static UtilServiceImpl instance = new UtilServiceImpl();
    private UtilServiceImpl(){}
    public static UtilServiceImpl getInstance(){
        return instance;
    }
    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd){
        //0이상 50 미만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150이상 200미만으로 만듦
        return start + (int)(Math.random()*gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return start + Math.round(
                (int)(Math.random() * gapBetweenStartAndEnd) * 10 ) / 10.0;
    }
    @Override
    public String createRandomUsername() {
        String username = "";
        for(; username.length() < 5; username += String.valueOf((char)('a' + this.createRandomInteger(0, 26))));
        //아스키코드 97+0 =a
        return username;
    }
    @Override
    public String createRandomName(){
        String[] name = {"이정재", "마동석", "송강호", "윤여정", "황정민",
                "정우성", "이병헌", "현 빈", "유해진", "손석구",
                "전도연", "손예진", "하지원", "김하늘", "송중기",
                "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return name[createRandomInteger(0,20)];
    }
    @Override
    public String createRandomTitle(){
        String[] titles = {"대통령은 국가의 원수","모든 국민","정당은 법률",
                "대통령은 내우","국교의 인정","국가안전보장회의","국회는 상호원조",
                "국회의원과 정부","대통령은 제3항","대통령이 궐위"};
        return titles[createRandomInteger(0,10)];
    }
    @Override
    public String createRandomContent(){
        String[] content = {
                "대통령은 국가의 원수이며, 외국에 대하여 국가를 대표한다. 전직대통령의 신분과 예우에 관하여는 법률로 정한다.",
                "모든 국민은 거주·이전의 자유를 가진다. 공무원의 신분과 정치적 중립성은 법률이 정하는 바에 의하여 보장된다.",
                "정당은 법률이 정하는 바에 의하여 국가의 보호를 받으며, 국가는 법률이 정하는 바에 의하여 정당운영에 필요한 자금을 보조할 수 있다.",
                "대통령은 내우·외환·천재·지변 또는 중대한 재정·경제상의 위기에 있어서 국가의 안전보장 또는 공공의 안녕질서를 유지하기 위하여 긴급한 조치가 필요하고 국회의 집회를 기다릴 여유가 없을 때에 한하여 최소한으로 필요한 재정·경제상의 처분을 하거나 이에 관하여 법률의 효력을 가지는 명령을 발할 수 있다.",
                "국교는 인정되지 아니하며, 종교와 정치는 분리된다. 국회에 제출된 법률안 기타의 의안은 회기중에 의결되지 못한 이유로 폐기되지 아니한다. 다만, 국회의원의 임기가 만료된 때에는 그러하지 아니하다.",
                "국가안전보장회의의 조직·직무범위 기타 필요한 사항은 법률로 정한다.",
                "국회는 상호원조 또는 안전보장에 관한 조약, 중요한 국제조직에 관한 조약, 우호통상항해조약, 주권의 제약에 관한 조약, 강화조약, 국가나 국민에게 중대한 재정적 부담을 지우는 조약 또는 입법사항에 관한 조약의 체결·비준에 대한 동의권을 가진다.",
                "국회의원과 정부는 법률안을 제출할 수 있다. 모든 국민은 그 보호하는 자녀에게 적어도 초등교육과 법률이 정하는 교육을 받게 할 의무를 진다.",
                "대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다.",
                "대통령이 궐위되거나 사고로 인하여 직무를 수행할 수 없을 때에는 국무총리, 법률이 정한 국무위원의 순서로 그 권한을 대행한다.",
        };
        return content[createRandomInteger(0,13)];
    }

    public String createRandomCompany(){
        String[] companies = {"구글","엔비디아","메타","삼성","LG","애플"};
        return null;
    }
}

