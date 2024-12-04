try (FileInputStream inputStream = new FileInputStream(filePath)) {
    int data;
    // Чтение байтов из файла до конца
    while ((data = inputStream.read()) != -1) {
        // Выводим каждый байт в виде символа
        System.out.print((char) data);
    }
} catch (IOException e) {
    e.printStackTrace();
}