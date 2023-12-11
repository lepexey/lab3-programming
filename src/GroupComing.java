import abstraction.Character;
import abstraction.Moves;

public class GroupComing {
    public static String comeTogether(Character... characters){
        if (characters.length == 1)
            return Moves.COME.getAction() + characters[0].getName();

        StringBuilder result = new StringBuilder();
        for (Character person: characters) {
            result.append("и ").append(person.getName()).append(" ");
        }

        result.append(Moves.COMEALL.getAction());
        result.append(" ");
        result.append(Moves.WISH_SWEET_DREAMS.getAction());
        return result.toString();
    }
}
