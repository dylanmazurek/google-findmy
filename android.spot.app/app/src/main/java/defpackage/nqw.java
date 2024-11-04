package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqw {
    public final nno a;
    public final Locale b;
    public nnw c;
    public Integer d;
    public nqu[] e;
    public int f;
    public boolean g;
    private final nnw h;
    private Object i;

    public nqw(nno nnoVar) {
        nno c = nnt.c(nnoVar);
        nnw z = c.z();
        this.h = z;
        this.a = c.a();
        this.b = Locale.getDefault();
        this.c = z;
        this.e = new nqu[8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(nnx nnxVar, nnx nnxVar2) {
        if (nnxVar != null && nnxVar.f()) {
            if (nnxVar2 != null && nnxVar2.f()) {
                return -nnxVar.compareTo(nnxVar2);
            }
            return 1;
        }
        if (nnxVar2 != null && nnxVar2.f()) {
            return -1;
        }
        return 0;
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new nqv(this);
        }
        return this.i;
    }

    public final nqu c() {
        nqu[] nquVarArr = this.e;
        int i = this.f;
        int length = nquVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            nqu[] nquVarArr2 = new nqu[length];
            System.arraycopy(nquVarArr, 0, nquVarArr2, 0, i);
            this.e = nquVarArr2;
            this.g = false;
            nquVarArr = nquVarArr2;
        }
        this.i = null;
        nqu nquVar = nquVarArr[i];
        if (nquVar == null) {
            nquVar = new nqu();
            nquVarArr[i] = nquVar;
        }
        this.f = i + 1;
        return nquVar;
    }

    public final void d(nns nnsVar, int i) {
        c().c(nnsVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(nnw nnwVar) {
        this.i = null;
        this.c = nnwVar;
    }

    public final long g(CharSequence charSequence) {
        boolean z;
        nqu[] nquVarArr = this.e;
        int i = this.f;
        if (this.g) {
            nquVarArr = (nqu[]) nquVarArr.clone();
            this.e = nquVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(nquVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (nquVarArr[i4].compareTo(nquVarArr[i3]) > 0) {
                        nqu nquVar = nquVarArr[i3];
                        nquVarArr[i3] = nquVarArr[i4];
                        nquVarArr[i4] = nquVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            nnx a = nnz.e.a(this.a);
            nnx a2 = nnz.g.a(this.a);
            nnx s = nquVarArr[0].a.s();
            if (a(s, a) >= 0 && a(s, a2) <= 0) {
                d(nns.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = nquVarArr[i5].b(j, true);
            } catch (noa e) {
                if (charSequence != null) {
                    String ag = a.ag((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = ag;
                    } else {
                        e.a = a.an(str, ag, ": ");
                    }
                }
                throw e;
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            nquVarArr[i6].a.x();
            nqu nquVar2 = nquVarArr[i6];
            if (i6 == i - 1) {
                z = true;
            } else {
                z = false;
            }
            j = nquVar2.b(j, z);
        }
        if (this.d != null) {
            return j - r0.intValue();
        }
        nnw nnwVar = this.c;
        if (nnwVar != null) {
            int b = nnwVar.b(j);
            long j2 = j - b;
            if (b != this.c.a(j2)) {
                String str2 = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    str2 = "Cannot parse \"" + ((String) charSequence) + "\": " + str2;
                }
                throw new nob(str2);
            }
            return j2;
        }
        return j;
    }

    public final void h(Object obj) {
        if (obj instanceof nqv) {
            nqv nqvVar = (nqv) obj;
            if (this == nqvVar.e) {
                this.c = nqvVar.a;
                this.d = nqvVar.b;
                this.e = nqvVar.c;
                int i = nqvVar.d;
                if (i < this.f) {
                    this.g = true;
                }
                this.f = i;
                this.i = obj;
            }
        }
    }
}
