package data.structures;

public class Tree {
    private int data;
    private Tree direita;
    private Tree esquerda;

    public Tree(int data) {
        this.data = data;
    }

    public void inserir(int data) {
        insert(this, data);
    }

    private void insert(Tree tree, int data) {
        if (data > tree.data) {
            if (tree.direita == null) {
                tree.direita = new Tree(data);
            } else {
                insert(tree.direita, data);
            }
        } else {
            if (tree.esquerda == null) {
                tree.esquerda = new Tree(data);
            } else {
                insert(tree.esquerda, data);
            }
        }
    }


    public boolean exists(int data) {
        return exists(data);
    }


    public void preOrder() {
        preOrder(this);

    }

    private void preOrder(Tree tree) {
        if (tree != null) {
            System.out.println(tree.data);
            preOrder(tree.esquerda);
            preOrder(tree.direita);
        }
    }

    public void inOrder() {
        inOrder(this);
    }

    private void inOrder(Tree tree) {
        if (tree != null) {
            inOrder(tree.esquerda);
            System.out.println(tree.data);
            inOrder(tree.direita);
        }
    }


    public void posOrder() {
        posOrder(this);

    }

    private void posOrder(Tree tree) {
        if (tree != null) {
            posOrder(tree.esquerda);
            posOrder(tree.direita);
            System.out.println(tree.data);
        }
    }

    public void bfs() {

    }


    public static void main(String[] args) {

        var tree = new Tree(50);
        tree.insert(tree, 30);
        tree.insert(tree, 70);
        tree.insert(tree, 20);
        tree.insert(tree, 40);
        tree.insert(tree, 60);
        tree.insert(tree, 80);
        tree.insert(tree, 15);
        tree.insert(tree, 30);
        System.out.println("****Em ordem*****");
        tree.inOrder();
        System.out.println("*****Pré Ordem*****");
        tree.preOrder();
        System.out.println("*****Pós Ordem*****");
        tree.posOrder();

    }
}