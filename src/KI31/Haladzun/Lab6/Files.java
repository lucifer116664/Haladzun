package KI31.Haladzun.Lab6;

import KI31.Haladzun.Lab5.Count;

import java.io.*;
import java.util.Scanner;

/**
 * ���� ��� ������ � �������
 */
public class Files {
    private final File file = new File("src/KI31/Haladzun/Lab6/result.txt");
    private final File binFile = new File("src/KI31/Haladzun/Lab6/result.bin");

    /**
     * ������ ��������� � ��������� ����
     * @param x
     * @throws FileNotFoundException
     */
    public void txtSave(double x) throws FileNotFoundException
    {
        PrintWriter fout = new PrintWriter(file);
        fout.print(Count.count(x));
        fout.close();
    }

    /**
     * �������� ��������� � ���������� �����
     * @throws FileNotFoundException
     */
    public void txtShow() throws FileNotFoundException
    {
        Scanner fin = new Scanner(file);
        System.out.println(fin.next() + " - ��������� � ���������� �����");
        fin.close();
    }

    /**
     * ������ ��������� � ������� ����
     * @param x
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binSave(double x) throws FileNotFoundException, IOException
    {
        DataOutputStream binFout = new DataOutputStream(new FileOutputStream(binFile));
        binFout.writeDouble(Count.count(x));
        binFout.close();
    }


    /**
     * �������� ��������� � �������� �����
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binShow() throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(binFile));
        System.out.println(dis.readDouble() + " - ��������� � �������� �����");
        dis.close();
    }
}
