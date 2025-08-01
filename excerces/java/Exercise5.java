package excerces.java;

public class Exercise5 {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[3];

        DataObject dataObject = new DataObject();
        dataObject.count = 6;
        dataObject.code = "sunday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 6;
        dataObject.code = "monday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 6;
        dataObject.code = "sunday";
        dataObjects[2] = dataObject;

        int sum = 0;
        for (int i = 0; i < dataObjects.length; i++) {
            if ("sunday".equals(dataObjects[i].code)) {
                sum += dataObjects[i].count;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
