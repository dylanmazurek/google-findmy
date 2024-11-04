package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.a, ((Optional) obj).a);
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        defpackage.a aVar = (Object) this.a;
        if (aVar != null) {
            consumer.accept(aVar);
        }
    }

    public boolean isEmpty() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public boolean isPresent() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        U apply = function.apply((Object) this.a);
        if (apply == null) {
            return empty();
        }
        return of(apply);
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.a;
        if (t == null) {
            return supplier.get();
        }
        return t;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }
}
