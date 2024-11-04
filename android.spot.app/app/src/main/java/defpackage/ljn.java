package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ljn extends lhw {
    public static final Map z = new ConcurrentHashMap();
    public int A = -1;
    public llp B = llp.a;

    public static void A(ljn ljnVar) {
        if (ljnVar != null && !ljnVar.u()) {
            throw new llo().a();
        }
    }

    public static nqe B(lkq lkqVar, Object obj, lkq lkqVar2, int i, llx llxVar) {
        return new nqe(lkqVar, obj, lkqVar2, new ljm(i, llxVar));
    }

    private final int c(llg llgVar) {
        if (llgVar == null) {
            return lkz.a.b(this).a(this);
        }
        return llgVar.a(this);
    }

    public static ljn m(ljn ljnVar, byte[] bArr, int i, int i2, lja ljaVar) {
        if (i2 == 0) {
            return ljnVar;
        }
        ljn l = ljnVar.l();
        try {
            llg b = lkz.a.b(l);
            b.i(l, bArr, i, i + i2, new lib(ljaVar));
            b.g(l);
            return l;
        } catch (IOException e) {
            if (e.getCause() instanceof ljy) {
                throw ((ljy) e.getCause());
            }
            throw new ljy(e);
        } catch (IndexOutOfBoundsException unused) {
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (ljy e2) {
            if (e2.a) {
                throw new ljy(e2);
            }
            throw e2;
        } catch (llo e3) {
            throw e3.a();
        }
    }

    public static ljr n(ljr ljrVar) {
        int i;
        int size = ljrVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return ljrVar.d(i);
    }

    public static lju o(lju ljuVar) {
        int i;
        int size = ljuVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return ljuVar.d(i);
    }

    public static ljv p(ljv ljvVar) {
        int i;
        int size = ljvVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return ljvVar.d(i);
    }

    public static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void w(Class cls, ljn ljnVar) {
        ljnVar.v();
        z.put(cls, ljnVar);
    }

    public static final boolean x(ljn ljnVar, boolean z2) {
        ljn ljnVar2;
        byte byteValue = ((Byte) ljnVar.z(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = lkz.a.b(ljnVar).k(ljnVar);
        if (z2) {
            if (true != k) {
                ljnVar2 = null;
            } else {
                ljnVar2 = ljnVar;
            }
            ljnVar.a(2, ljnVar2);
        }
        return k;
    }

    protected abstract Object a(int i, Object obj);

    @Override // defpackage.lkq
    public final void cA(liv livVar) {
        llg b = lkz.a.b(this);
        ktd ktdVar = livVar.f;
        if (ktdVar == null) {
            ktdVar = new ktd(livVar);
        }
        b.m(this, ktdVar);
    }

    @Override // defpackage.lkq
    public final /* synthetic */ lkp cR() {
        ljh ljhVar = (ljh) z(5);
        ljhVar.w(this);
        return ljhVar;
    }

    @Override // defpackage.lkq
    public final /* synthetic */ lkp cz() {
        return (ljh) z(5);
    }

    @Override // defpackage.lhw
    public final int d(llg llgVar) {
        if (y()) {
            int c = c(llgVar);
            if (c >= 0) {
                return c;
            }
            throw new IllegalStateException(a.ae(c, "serialized size must be non-negative, was "));
        }
        int i = this.A & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = c(llgVar);
        if (c2 >= 0) {
            this.A = (this.A & Integer.MIN_VALUE) | c2;
            return c2;
        }
        throw new IllegalStateException(a.ae(c2, "serialized size must be non-negative, was "));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return lkz.a.b(this).j(this, (ljn) obj);
    }

    public final int hashCode() {
        if (!y()) {
            int i = this.y;
            if (i == 0) {
                int i2 = i();
                this.y = i2;
                return i2;
            }
            return i;
        }
        return i();
    }

    public final int i() {
        return lkz.a.b(this).b(this);
    }

    @Override // defpackage.lkq
    public final int j() {
        int i;
        if (y()) {
            i = c(null);
            if (i < 0) {
                throw new IllegalStateException(a.ae(i, "serialized size must be non-negative, was "));
            }
        } else {
            i = this.A & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = c(null);
                if (i >= 0) {
                    this.A = (this.A & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(a.ae(i, "serialized size must be non-negative, was "));
                }
            }
        }
        return i;
    }

    public final ljh k() {
        return (ljh) z(5);
    }

    public final ljn l() {
        return (ljn) z(4);
    }

    @Override // defpackage.lkq
    public final lkx q() {
        return (lkx) z(7);
    }

    @Override // defpackage.lkr
    public final /* synthetic */ lkq s() {
        return (ljn) z(6);
    }

    public final void t() {
        lkz.a.b(this).g(this);
        v();
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        lks.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.lkr
    public final boolean u() {
        return x(this, true);
    }

    public final void v() {
        this.A &= Integer.MAX_VALUE;
    }

    public final boolean y() {
        if ((this.A & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final Object z(int i) {
        return a(i, null);
    }
}
