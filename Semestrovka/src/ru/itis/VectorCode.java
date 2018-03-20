package ru.itis;

public class VectorCode {
    private Vector head;
    private Vector tail;
    private int size;
    private int amountOfNulls;

    private static class Vector {
        int index;
        int value;
        boolean nextNull;
        Vector next;

        Vector(int index, int value) {
            this.index = index;
            this.value = value;
            this.nextNull = false;
        }

    }

    public VectorCode(int[] array) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.amountOfNulls = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] != 0) {
                Vector newVector = new Vector(i, array[i]);
                if(head == null) {
                    head = newVector;
                    tail = newVector;
                    size++;
                } else {
                    tail.next = newVector;
                    tail = newVector;
                    size++;
                }
                if(array[i + 1] == 0) {
                    newVector.nextNull = true;
                    amountOfNulls++;
                }
            }
        }
        if(array[array.length - 1] != 0) {
            Vector newVector = new Vector(array.length - 1, array[array.length - 1]);
            tail.next = newVector;
            tail = newVector;
            size++;
        }
    }

    public int[] decode() {
        Vector current = head;
        int array[] = new int[size + amountOfNulls];

        while (current != null) {
            array[current.index] = current.value;
            current = current.next;
        }

        return array;
    }

    public void delete(int position) {
        if(position < size) {
            int element = 0;
            Vector vectorToDelete = head;
            while(element < position) {
                element++;
                vectorToDelete = vectorToDelete.next;
            }
            vectorToDelete.index = 0;
            vectorToDelete.value = 0;
        }
    }

    public void insert(int k, int position) {
        if(position < size) {
            int element = 0;
            Vector vectorToDelete = head;
            while(element < position) {
                element++;
                vectorToDelete = vectorToDelete.next;
            }
            vectorToDelete.index = position;
            vectorToDelete.value = k;
        } else if(position >= size) {
            Vector newVector= new Vector(position, k);
            tail.next = newVector;
            tail = newVector;
        }
    }

    public int scalarProduct(VectorCode v) {
        Vector current = head;
        Vector anotherCurrent = v.head;
        int scalarProduct = 0;
        while(current != tail) {
            scalarProduct += current.value * anotherCurrent.value;
            current = current.next;
            anotherCurrent = anotherCurrent.next;
        }
        return scalarProduct;
    }

    public VectorCode sum(VectorCode v) {
        Vector current = head;
        Vector anotherCurrent = v.head;
        while(current != tail) {
            while(anotherCurrent != v.tail)
                if(current.index == anotherCurrent.index) {
                    anotherCurrent.value += current.value;
                }
            current = current.next;
            anotherCurrent = anotherCurrent.next;
        }

        return v;
    }

    public VectorCode vectorSum() {
        int array[] = new int[size + amountOfNulls];
        Vector current = head;
        int newX = 0;
        int i = 0;
        while(i < size) {
            for(int j = 0; j < i; j++) {
                newX += current.value;
            }
            array[i] = newX;
            current = current.next;
            i++;
        }
        VectorCode vectorCode = new VectorCode(array);
        return vectorCode;
    }

    public void mult(int a, int c) {
        Vector current = head;
        while(current != tail) {
            if(current.index == a)
                current.index *= c;
            if(current.value == a)
                current.value *= c;
            current = current.next;
        }
    }

    public void sOut() {
        Vector current = head;
        while(current != tail) {
            System.out.print("(" + current.index + ";" + current.value + ") ");
            current = current.next;
        }
        System.out.println("(" + current.index + ";" + current.value + ") ");
        System.out.println("Size is " + size);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
