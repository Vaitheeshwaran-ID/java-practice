//need more practice 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==q){
        return true;
        }
        if(p==null||q==null||p.val!=q.val){
            return false;
        }
//try new programs
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
