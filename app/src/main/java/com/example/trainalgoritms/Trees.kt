package com.example.trainalgoritms

import kotlin.math.max
import kotlin.math.min


class TreeNode(var data: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinarySearchTree {
    var root: TreeNode? = null

    fun insert(data: Int){
        insertReq(root, data)
    }

    private fun insertReq(node: TreeNode?, data: Int) : TreeNode {
        if (node == null) {
            return TreeNode(data)
        }

        if (data < node.data)
            node.left = insertReq(node.left, data)
        else if (data > node.data)
            node.right = insertReq(node.right, data)

        return node
    }
}

//Search an element in Binary Tree
fun searchBinaryTree(root: TreeNode?, data: Int): Boolean {
    if (root == null) return false

    if (root.data == data) return true

    return searchBinaryTree(root.left, data) ||
            searchBinaryTree(root.right, data)
}

//Find greatest element from the BST
fun findGreatestElement(root: TreeNode?): Int? {
    if (root == null) return null

    var current = root
    while (current?.right != null) {
        current = current.right
    }
    return current?.data
}


//Find smallest element from the BST
fun findSmallestElement(root: TreeNode?):Int? {
    if (root == null) return null
    var current = root
    while (current?.left!=null){
        current = current.left
    }
    return current?.data
}

// Find height of the tree
fun findHeightTree(root: TreeNode?): Int {
   if (root == null) return -1

    return max(findHeightTree(root.left), findHeightTree(root.right))+1
}

fun inorderRecursive(root: TreeNode?) {
    if (root == null) return
    inorderRecursive(root.left)
    println(root.data)
    inorderRecursive(root.right)
}