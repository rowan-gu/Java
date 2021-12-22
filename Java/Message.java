public class Message {

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("You didn't enter anything!");
        }else{
            System.out.println("Here is what you entered:");
            for (String word : args){
                System.out.println(word);
            }
        }
    }
}
