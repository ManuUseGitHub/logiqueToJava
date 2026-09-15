package be.technifutur.libs;

public class ListeUtil {
    public static int peek(Liste p_list) {
        return p_list.getValue();
    }

    public static boolean hasNext(Liste p_list) {
        return p_list.getSuivant() != null;
    }

    public static int size(Liste p_list) {
        Liste cursor;
        int count;

        cursor = p_list;
        count = 0;

        while (cursor != null) {
            ++count;
            cursor = cursor.getSuivant();
        }
        return count;
    }

    public static Liste push(Liste p_list, int value) {
        Liste temp;

        temp = new Liste();
        temp.setValue(value);
        temp.setSuivant(p_list);
        p_list = temp;

        return p_list;
    }

    public static Liste pop(Liste p_list) {
        return p_list.getSuivant();
    }

    public static Liste get(Liste p_list, int pos) {
        Liste cursor;
        int cpt;

        cursor = p_list;
        cpt = 1;
        while (cpt < pos) {
            cursor = cursor.getSuivant();
            ++cpt;
        }
        return cursor;
    }

    public static int update(Liste p_list, int pos, int val) {
        Liste found = get(p_list, pos);
        found.setValue(val);
        return found.getValue();
    }

    public static int add(Liste p_list, int val) {
        Liste cursor;
        Liste temp;

        temp = new Liste();
        temp.setValue(val);

        cursor = p_list;
        while (hasNext(cursor)) {
            cursor = cursor.getSuivant();
        }
        cursor.setSuivant(temp);
        return val;
    }

    public static int delete(Liste p_list, int pos) {
        Liste cursor;
        Liste toDelete;
        int deletedVal;

        if (pos == 1) {
            deletedVal = p_list.getValue();
            p_list = p_list.getSuivant();
            return deletedVal;
        }

        cursor = get(p_list, pos - 1);

        toDelete = cursor.getSuivant();
        deletedVal = toDelete.getValue();

        cursor.setSuivant(toDelete.getSuivant());

        return deletedVal;
    }

    public static Liste insert(Liste p_list, int val, int pos) {
        Liste cursor;
        Liste temp;
        Liste result;

        // insertion en tête
        if (pos == 1) {
            result = ListeUtil.push(p_list, val);
        } else {

            // on cree le maillon à ajouter
            temp = new Liste();
            temp.setValue(val);

            // on initialise le curseur avec la liste
            cursor = p_list;

            // voayage jsuqu'à l'élément précédent la position d'insertion
            cursor = get(p_list, pos - 1);

            // l'élément inséré prend le suivant naturel
            temp.setSuivant(cursor.getSuivant());

            // l'élément inséré est pointé par l'élément en cours
            cursor.setSuivant(temp);

            result = cursor;
        }
        return result;
    }
}
