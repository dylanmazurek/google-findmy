package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mri implements Iterator, mpq {
    final /* synthetic */ mrg a;
    private int b = -1;
    private int c;
    private int d;
    private mqg e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public mri(mrg mrgVar) {
        this.a = mrgVar;
        int ae = moz.ae(0, 0, mrgVar.b.length());
        this.c = ae;
        this.d = ae;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mol] */
    private final void a() {
        int i = this.d;
        int i2 = 0;
        if (i >= 0) {
            if (i > this.a.b.length()) {
                this.e = new mqg(this.c, moz.j(this.a.b));
                this.d = -1;
            } else {
                mrg mrgVar = this.a;
                Object a = mrgVar.a.a(mrgVar.b, Integer.valueOf(this.d));
                if (a == null) {
                    this.e = new mqg(this.c, moz.j(this.a.b));
                    this.d = -1;
                } else {
                    mkw mkwVar = (mkw) a;
                    int intValue = ((Number) mkwVar.a).intValue();
                    int intValue2 = ((Number) mkwVar.b).intValue();
                    this.e = moz.ak(this.c, intValue);
                    int i3 = intValue + intValue2;
                    this.c = i3;
                    if (intValue2 == 0) {
                        i2 = 1;
                    }
                    this.d = i3 + i2;
                }
            }
            this.b = 1;
            return;
        }
        this.b = 0;
        this.e = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            mqg mqgVar = this.e;
            mqgVar.getClass();
            this.e = null;
            this.b = -1;
            return mqgVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
