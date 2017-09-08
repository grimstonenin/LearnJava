package codewars;

import java.util.Arrays;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    int itemsPerPage;
    List<I> objectsToPaginate;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        objectsToPaginate = collection;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {

        return this.objectsToPaginate.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (itemCount()/itemsPerPage)+1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if(pageIndex<0||pageIndex>pageCount()-1) return -1;

        if(pageIndex==(pageCount()-1)) return
                (itemCount()%itemsPerPage==0 ? itemsPerPage : itemCount()%itemsPerPage);

        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if(itemIndex<0||itemIndex>itemCount()-1) return -1;

        return itemIndex/itemsPerPage;
    }

    public static void main(String[] args){
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

        System.out.println("helper.pageCount()");
        System.out.print(helper.pageCount());
        System.out.println(" should == 2");

        System.out.println("helper.itemCount()");
        System.out.print(helper.itemCount());
        System.out.println(" should == 6");

        System.out.println("helper.pageItemCount(0)");
        System.out.print( helper.pageItemCount(0));
        System.out.println(" should == 4");

        System.out.println("helper.pageItemCount(1)");
        System.out.print( helper.pageItemCount(1));
        System.out.println(" last page - should == 2");

        System.out.println("helper.pageItemCount(2)");
        System.out.print(helper.pageItemCount(2));
        System.out.println("should == -1 since the page is invalid");


// pageIndex takes an item index and returns the page that it belongs on

        System.out.println("helper.pageIndex(5)");
        System.out.print(helper.pageIndex(5));
        System.out.println(" should == 1 (zero based index)");

        System.out.println("helper.pageIndex(2)");
        System.out.print(helper.pageIndex(2));
        System.out.println(" should == 0");

        System.out.println("helper.pageIndex(20)");
        System.out.print(helper.pageIndex(20));
        System.out.println(" should == -1");

        System.out.println("helper.pageIndex(-10)");
        System.out.print(helper.pageIndex(-10));
        System.out.println(" should == -1");

    }
}