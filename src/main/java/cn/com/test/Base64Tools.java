package cn.com.test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;


public class Base64Tools {
 
    /**
     * 将文件转成base64 字符串
     *
     * @param path 文件路径
     * @return
     */
    public static String encodeBase64File(String path) {
        try {
            //读取文件，将文件 转换为字符串
            File file = new File(path);
            FileInputStream inputFile = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            inputFile.read(buffer);
            inputFile.close();
            System.err.println("加密");
            //字符串加密
            String myEncoding=new BASE64Encoder().encode(buffer);
            //将加密后的内容重新写入文件
            File file1=new File(path);
            FileWriter writer=new FileWriter(file1);
            writer.write(myEncoding);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }
 
    /**
     * 将base64字符解码保存文件
     *
     * @param targetPath 保存的文件夹路径名
     */
    public static void decoderBase64File(String localPath,String targetPath) {
        //读取文件内容
        File file = new File(localPath);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //解密
        byte[] b = null;
        if(sbf != null){
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(sbf.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //创建一个文件字节输出流，将解密后的内容写进文件
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(targetPath);
            for(int i=0; i<b.length; i++) {
                out.write(b[i]);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        encodeBase64File("C:\\Users\\Administrator\\Desktop\\11.xml");
        //localPath为需要解密的文件地址,targetPath为文件目标地址
        decoderBase64File("C:\\Users\\Administrator\\Desktop\\11.xml","C:\\Users\\Administrator\\Desktop\\world111.xml");
    }
}