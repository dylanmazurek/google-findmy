package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnz {
    final ta a;
    final ta b;
    final ta c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public cnz(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ta(), new ta(), new ta());
    }

    private final Class v(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final int a(int i, int i2) {
        if (!s(i2)) {
            return i;
        }
        return this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        if (!s(i)) {
            return parcelable;
        }
        return this.d.readParcelable(getClass().getClassLoader());
    }

    public final coa c() {
        String n = n();
        if (n == null) {
            return null;
        }
        cnz m = m();
        try {
            Method method = (Method) this.a.get(n);
            if (method == null) {
                method = Class.forName(n, true, cnz.class.getClassLoader()).getDeclaredMethod("read", cnz.class);
                this.a.put(n, method);
            }
            return (coa) method.invoke(null, m);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(e4);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        if (!s(i)) {
            return charSequence;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        if (!s(i)) {
            return str;
        }
        return n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(coa coaVar) {
        if (coaVar != null) {
            try {
                r(v(coaVar.getClass()).getName());
                cnz m = m();
                try {
                    Class<?> cls = coaVar.getClass();
                    Method method = (Method) this.b.get(cls.getName());
                    if (method == null) {
                        method = v(cls).getDeclaredMethod("write", cls, cnz.class);
                        this.b.put(cls.getName(), method);
                    }
                    method.invoke(null, coaVar, m);
                    m.o();
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    Throwable cause = e4.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException(e4);
                    }
                    throw ((RuntimeException) cause);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(String.valueOf(coaVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
            }
        }
        r(null);
    }

    public final boolean l(boolean z, int i) {
        if (s(i)) {
            if (this.d.readInt() != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    protected final cnz m() {
        int dataPosition = this.d.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        Parcel parcel = this.d;
        String str = this.h;
        return new cnz(parcel, dataPosition, i2, str.concat("  "), this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.e;
            Parcel parcel = this.d;
            int i2 = sparseIntArray.get(i);
            int dataPosition = parcel.dataPosition();
            this.d.setDataPosition(i2);
            this.d.writeInt(dataPosition - i2);
            this.d.setDataPosition(dataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            Parcel parcel = this.d;
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        if (this.k == i) {
            return true;
        }
        return false;
    }

    public final coa t(coa coaVar) {
        if (!s(1)) {
            return coaVar;
        }
        return c();
    }

    public final void u(coa coaVar) {
        p(1);
        k(coaVar);
    }

    private cnz(Parcel parcel, int i, int i2, String str, ta taVar, ta taVar2, ta taVar3) {
        this.a = taVar;
        this.b = taVar2;
        this.c = taVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
