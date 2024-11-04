package j$.util;

/* loaded from: classes2.dex */
public final class OptionalInt {
    private static final OptionalInt c = new OptionalInt();
    private final boolean a;
    private final int b;

    private OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static OptionalInt a() {
        return c;
    }

    public static OptionalInt b(int i) {
        return new OptionalInt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        boolean z = this.a;
        if (z && optionalInt.a) {
            if (this.b == optionalInt.b) {
                return true;
            }
        } else if (z == optionalInt.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public int orElse(int i) {
        if (this.a) {
            return this.b;
        }
        return i;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }

    private OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
