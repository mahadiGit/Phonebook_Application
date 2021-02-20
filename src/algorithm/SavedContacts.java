package algorithm;

public class SavedContacts {

    /**
     * this is noticeable that phone number should start
     * with 01 but instead of doing that phone number started
     * with just 1. the reason behind that, 01 represent the
     * octal number system so when any number starts with 01
     * that become a octal number. and using octal number as
     * phone number create several issues.
     */
    public static RecordInfo[] contacts(){
        RecordInfo[] record = new RecordInfo[10];

        record[0] = new RecordInfo("Mahadi Hasan", 1303701021);
        record[1] = new RecordInfo("Arafat al Ajmir", 1956481919);
        record[2] = new RecordInfo("Nayeam ahmed", 1794354469);
        record[3] = new RecordInfo("Ms Junadullah", 1797260464);
        record[4] = new RecordInfo("Sumaya Akther Mou", 1716984387);
        record[5] = new RecordInfo("Esbat Hossain", 1725489248);
        record[6] = new RecordInfo("Sukanto Paul", 1358942587);
        record[7] = new RecordInfo("Alvi R Khan", 1925489324);
        record[8] = new RecordInfo("Mohuya Khondokar", 1725489632);
        record[9] = new RecordInfo("Sahela Khan Munia", 1347845692);

        return record;
    }
}
