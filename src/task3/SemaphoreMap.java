package task3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreMap<E> implements Map<E, Boolean> {
    private final Set<E> set = new HashSet<>();
    private final Semaphore semaphore = new Semaphore(1, true);

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = set.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        try {
            semaphore.acquire();
            isEmpty = set.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return isEmpty;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Boolean get(Object key) {
        return null;
    }

    @Override
    public Boolean put(E key, Boolean value) {
        return null;
    }

    public boolean contains(Object o) {
        boolean contains = false;
        try {
            semaphore.acquire();
            contains = set.contains(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return contains;
    }

    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            semaphore.acquire();
            iterator = set.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        assert iterator != null;
        return iterator;
    }

    public Object[] toArray() {
        Object[] array = new Object[0];
        try {
            semaphore.acquire();
            array = set.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        Object[] array = new Object[0];
        try {
            semaphore.acquire();
            array = set.toArray((Object[]) a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return (T[]) array;
    }

    public boolean add(E e) {
        boolean add = false;
        try {
            semaphore.acquire();
            add = set.add(e);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            semaphore.release();
        }
        return add;
    }

    @Override
    public Boolean remove(Object o) {
        boolean remove = false;
        try {
            semaphore.acquire();
            remove = set.remove(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return remove;
    }

    @Override
    public void putAll(Map<? extends E, ? extends Boolean> m) {

    }

    public boolean containsAll(Collection<?> c) {
        boolean containsAll = false;
        try {
            semaphore.acquire();
            containsAll = set.containsAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return containsAll;
    }

    public boolean addAll(Collection<? extends E> c) {
        boolean addAll = false;
        try {
            semaphore.acquire();
            addAll = set.addAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return addAll;
    }

    public boolean retainAll(Collection<?> c) {
        boolean retainAll = false;
        try {
            semaphore.acquire();
            retainAll = set.retainAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return retainAll;
    }

    public boolean removeAll(Collection<?> c) {
        boolean removeAll = false;
        try {
            semaphore.acquire();
            removeAll = set.removeAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return removeAll;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<E> keySet() {
        return null;
    }

    @Override
    public Collection<Boolean> values() {
        return null;
    }

    @Override
    public Set<Entry<E, Boolean>> entrySet() {
        return null;
    }
}
