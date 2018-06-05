# Segment Tree.

Segment tree is a static data structure, once created, can not change, you can only update the information it carries, but not add new tree node or remove node:
* build : it is a recursive binary approach, each node will have a range [left, right], and when the left == right, you meet a leaf node, which will store the data in it, this data serves as two purposes,say your want each node save information regarding [left, right]' maxium number in the array, the left node's maxium value is the value in the array, so the value is data in array also as maxium value in segment tree.
* query.  query range[ left.. right], if left == right, then looking for data saved in  leaf node. if left..right covers two range, split it and query recursively, if the query range is smaller than current segment tree node, then the current node carries the result for query.
* modify/update, this is the update the leaf node's data. then update the parent's info carried.


