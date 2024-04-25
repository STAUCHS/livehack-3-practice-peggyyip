class Main extends ConsoleProgram {
  public void run() {
     System.out.println(doubleChar("The"));
  }

  public String doubleChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      result += Character.toString(c) + Character.toString(c);
    }
    
    return result;
  }

}