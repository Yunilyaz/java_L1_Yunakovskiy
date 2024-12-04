try (FileOutputStream outputStream = new FileOutputStream("out.txt", true)) {
    // Запись числа в файл
    output.write(30);
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}