

oobject BST {


  def main(args: Array[String]) {
    val t = new Node(5, Leaf, Leaf)
    val t2 = t.insert(3).insert(7).insert(6).insert(2).insert(1)
    println(t2.toString) //toString included to help with debugging.
    println(t.depth)
    println(t2.depth)
    val t3 = new Node(3, Leaf, Leaf)
    val t4 = t3.insert(2).insert(1)
    println(t3.depth)
    println(t4.depth)
    println(t2.equal(t2))
    // Is t4 an exactsubtree of t2?
    println(t4.exactsubtree(t2))

  }


  abstract class BSTree { //Can't be instantiated - can't make an object of type BSTree.

    //CAN have variable whose type is BSTree, but the object it references will be a Leaf or Node
    def member(x: Int): Boolean //Tells us if x is in the BSTree
    def insert(x: Int): BSTree //creates a new tree that is the same as this one, but with x added
    def equal(other: BSTree): Boolean //Returns true if the two trees have identical values and structure, false o/w

    //def merge(other:BSTree): BSTree//Creates a new tree which contains all elements of this and of other

    def depth: Int
    // return the number of values traversed
    // between root & deepest leaf
    // NO Pattern Matching

    def max: Int

    // returns largest # in the BST

    // returns -1 if BST is empty

    def exactsubtree(that: BSTree): Boolean

  }


  case object Leaf extends BSTree { //"object" means we only create one Leaf object - but this is OK because we can have as many references to it as we like.
    def member(x: Int): Boolean = false //Nothing is in the empty tree
    def insert(x: Int): BSTree = new Node(x, Leaf, Leaf)
    def equal(other: BSTree): Boolean = {
      this == other

    }

    /*

    def equal(other:BSTree):Boolean = {

    other match{

         case Leaf => true

         case Node(_, _, _) => false//_ don't care

       }

    }

    */

    def depth: Int = 0 // was 1

    def exactsubtree(that: BSTree): Boolean = {
      this == that
    }

    // returns true if this appears in the exact same structure as a subtree of that

    // USE PATTERN MATCHING!!!!!!!!!!

    override def toString = "."
    def max: Int = -1

    // returns largest # in the BST

    // returns -1 if BST is empty

  }


  case class Node(value: Int, left: BSTree, right: BSTree) extends BSTree {

    def member(x: Int): Boolean = {
      if (value == x) true
      else if (x < value) left.member(x)
      else right member x
    }

    def insert(x: Int): BSTree = { //creates a new tree that is the same as this one, but with x added
      //No duplicates
      if (x < value) new Node(value, left.insert(x), right) //Return type is boolean.  Recursion - recurse down both left and right or just one?
      else if (x > value) new Node(value, left, right insert x)
      else this //new Node(left, right)

    }

    def equal(other: BSTree): Boolean = {
      other match {
        case Leaf => false
        case Node(v, l, r) => (value == v) && (left equal l) && (right equal r)

      }


    }

    def depth: Int = {

      val l = left.depth
      val r = right.depth
      if (l > r) l + 1
      else if (l < r) r + 1
      else l + 1 // equal depths
    }


    def exactsubtree(that: BSTree): Boolean = {
      that match {
        case Leaf => false
        case Node(v, l, r) =>
          if (value == v) ((left exactsubtree l) && (right exactsubtree r))
          else if (value < v) this exactsubtree l
          else this exactsubtree r

      }

    }

    // returns true if this appears in the exact same structure as a subtree of that
    // USE PATTERN MATCHING!!!!!!!!!!8

    override def toString = "{" + left.toString + value.toString + right.toString + "}"

    def max: Int = {
      // returns largest # in the BST
      // returns -1 if BST is empty
      // so, not doing 2 recursive calls -- calling right.max once
      val m = right.max
      if (m > value) m
      else value

    }

    def subtree(that:BSTree):Boolean ={
      if(equal(Leaf)) false
      else if(value > this.value) subtree(right)
      else if(value < this.value) subtree(left)
      else true
    }

    def merge(that:BSTree):BSTree ={

    }


  }

}