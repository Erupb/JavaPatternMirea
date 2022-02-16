package task3;

import java.util.*;

public class SynchronizedSet<E> implements Set<E> {
    private final List<E> list = new ArrayList<E>();

        @Override
        public synchronized int size() {
            return list.size();
        }

        @Override
        public synchronized boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public synchronized boolean contains(Object o) {
            return list.contains(o);
        }

        @Override
        public synchronized Iterator<E> iterator() {
            return list.iterator();
        }

        @Override
        public synchronized Object[] toArray() {
            return list.toArray();
        }

        @SuppressWarnings("unchecked")
        @Override
        public synchronized <T> T[] toArray(T[] a) {
            return (T[]) list.toArray((Object[]) a);
        }

        @Override
        public synchronized boolean add(E e) {
            return list.add(e);
        }

        @Override
        public synchronized boolean remove(Object o) {
            return list.remove(o);
        }

        @Override
        public synchronized boolean containsAll(Collection<?> c) {
            return list.containsAll(c);
        }

        @Override
        public synchronized boolean addAll(Collection<? extends E> c) {
            return list.addAll(c);
        }

        @Override
        public synchronized boolean removeAll(Collection<?> c) {
            return list.removeAll(c);
        }

        @Override
        public synchronized boolean retainAll(Collection<?> c) {
            return list.retainAll(c);
        }

        @Override
        public synchronized void clear() {
            list.clear();
        }
    };


