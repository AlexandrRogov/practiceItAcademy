package week03.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import week03.tree.Tree;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TreeNodeClassUtil {

    public static Tree<Integer> buildIntegerTree() {
        Tree<Integer> tree = new Tree<>();
        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(6);

        return tree;
    }

    public static Tree<Character> buildCharacterTree() {
        Tree<Character> tree = new Tree<>();
        tree.add('m');
        tree.add('n');
        tree.add('e');
        tree.add('h');
        tree.add('a');

        return tree;
    }
}
