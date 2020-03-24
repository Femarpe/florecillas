import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Model {
    List<Flor> listaflores = new List<Flor>() {
        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean contains(Object o) {
            return false;
        }

        public Iterator<Flor> iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public <T> T[] toArray(T[] a) {
            return null;
        }

        public boolean add(Flor flor) {
            return false;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends Flor> c) {
            return false;
        }

        public boolean addAll(int index, Collection<? extends Flor> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }

        public Flor get(int index) {
            return null;
        }

        public Flor set(int index, Flor element) {
            return null;
        }

        public void add(int index, Flor element) {

        }

        public Flor remove(int index) {
            return null;
        }

        public int indexOf(Object o) {
            return 0;
        }

        public int lastIndexOf(Object o) {
            return 0;
        }

        public ListIterator<Flor> listIterator() {
            return null;
        }

        public ListIterator<Flor> listIterator(int index) {
            return null;
        }

        public List<Flor> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
}
