package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class s {
    public static InterfaceC0018p a(FileAttribute fileAttribute) {
        Object value;
        if (fileAttribute != null) {
            value = fileAttribute.value();
            if (e(value)) {
                return new q(fileAttribute);
            }
            return C0016n.a(fileAttribute);
        }
        return null;
    }

    public static B b(FileTime fileTime) {
        long millis;
        if (fileTime != null) {
            millis = fileTime.toMillis();
            return B.r(millis);
        }
        return null;
    }

    public static FileAttribute c(InterfaceC0018p interfaceC0018p) {
        if (interfaceC0018p == null) {
            return null;
        }
        if (e(interfaceC0018p.value())) {
            return new r(interfaceC0018p);
        }
        return C0017o.a(interfaceC0018p);
    }

    public static FileTime d(B b) {
        FileTime fromMillis;
        if (b != null) {
            fromMillis = FileTime.fromMillis(b.S());
            return fromMillis;
        }
        return null;
    }

    private static boolean e(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (!set.isEmpty()) {
                Object next = set.iterator().next();
                if ((next instanceof I) || j$.adapter.b.t(next)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ long f(long j, long j2) {
        long j3 = j / j2;
        if (j - (j2 * j3) == 0) {
            return j3;
        }
        if ((((j ^ j2) >> 63) | 1) < 0) {
            return j3 - 1;
        }
        return j3;
    }

    public static /* synthetic */ long g(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        if ((((j ^ j2) >> 63) | 1) <= 0) {
            return j3 + j2;
        }
        return j3;
    }
}
