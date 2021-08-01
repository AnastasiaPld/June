package NewProject;

import java.io.*;

public class SerializeTools {
    public static void toFile(Serializable obj, String storePath)throws Exception{
        FileOutputStream fileOutputStream=new FileOutputStream(new File(storePath));
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
    }
    public static Object fromFile(String storePath)throws  Exception{
        FileInputStream fileInputStream=new FileInputStream(new File(storePath));
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object obj=objectInputStream.readObject();
        return obj;
    }
}
