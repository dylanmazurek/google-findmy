package j$.lang;

import j$.nio.file.attribute.InterfaceC0018p;
import j$.nio.file.attribute.s;
import j$.util.Collection;
import j$.util.function.c;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.a] */
    public static j$.util.function.a a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.a
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.lang.a.a(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static c b(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        intConsumer2.getClass();
        return new IntConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                IntConsumer.this.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.lang.a.b(this, intConsumer3);
            }
        };
    }

    public static /* synthetic */ void c(Iterable iterable, Consumer consumer) {
        if (iterable instanceof b) {
            ((b) iterable).forEach(consumer);
        } else if (iterable instanceof Collection) {
            Collection.CC.$default$forEach((java.util.Collection) iterable, consumer);
        } else {
            Iterable$CC.$default$forEach(iterable, consumer);
        }
    }

    public static /* synthetic */ long d(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j2 ^ j) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ InterfaceC0018p[] e(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC0018p[] interfaceC0018pArr = new InterfaceC0018p[length];
        for (int i = 0; i < length; i++) {
            interfaceC0018pArr[i] = s.a(fileAttributeArr[i]);
        }
        return interfaceC0018pArr;
    }

    public static /* synthetic */ FileAttribute[] f(InterfaceC0018p[] interfaceC0018pArr) {
        if (interfaceC0018pArr == null) {
            return null;
        }
        int length = interfaceC0018pArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr[i] = s.c(interfaceC0018pArr[i]);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long g(long j, long j2) {
        boolean z;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (j2 != Long.MIN_VALUE) {
                z2 = true;
            }
            if (z | z2) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long h(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = false;
        if ((j2 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
