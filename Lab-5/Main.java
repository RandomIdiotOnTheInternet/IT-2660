class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST<Integer> lab5Tree = new BST<>();
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10

    lab5Tree.Insert(13);
    lab5Tree.Insert(22);
    lab5Tree.Insert(36);
    lab5Tree.Insert(5);
    lab5Tree.Insert(48);
    lab5Tree.Insert(17);
    lab5Tree.Insert(39);
    lab5Tree.Insert(2);
    lab5Tree.Insert(26);
    lab5Tree.Insert(40);
    lab5Tree.Insert(29);
    lab5Tree.Insert(34);
    lab5Tree.Insert(10);
    // Step 3 - Delete the value 17
    lab5Tree.Delete(17);
    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.println(lab5Tree.inorder());
    // Step 5 - Traverse and output the values using postorder

    // Step 6 - Traverse and output the values using preorder

    // Step 7 - Display the result of a search for the value 36

    // Step 8 - Display the result of a search for the value 37

    // Step 9 - Using the path() method, display the path from the root to 2

    // Step 10 - Display the path from the root to 34

  }
}