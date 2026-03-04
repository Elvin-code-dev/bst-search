import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    // test if the tree contains the root value
    @Test
    public void testContainsRootValue() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        boolean actual = BstSearch.contains(root, 10);

        assertTrue(actual);
    }

    // test if the tree contains a value on the left side
    @Test
    public void testContainsLeftValue() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);

        boolean actual = BstSearch.contains(root, 5);

        assertTrue(actual);
    }

    // test if the tree contains a value on the right side
    @Test
    public void testContainsRightValue() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.right = new BinaryTreeNode<>(20);

        boolean actual = BstSearch.contains(root, 20);

        assertTrue(actual);
    }

    // test when the value is not in the tree
    @Test
    public void testValueNotFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(20);

        boolean actual = BstSearch.contains(root, 99);

        assertFalse(actual);
    }

    // test when the tree is empty
    @Test
    public void testEmptyTree() {

        boolean actual = BstSearch.contains(null, 10);

        assertFalse(actual);
    }
}
