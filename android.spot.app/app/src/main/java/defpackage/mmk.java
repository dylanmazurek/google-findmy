package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmk extends mmj implements Iterator, mpq {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmk(mml mmlVar, int i, byte[] bArr) {
        super(mmlVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            mml mmlVar = this.a;
            if (i < mmlVar.e) {
                this.b = i + 1;
                this.c = i;
                Object obj = mmlVar.b[i];
                b();
                return obj;
            }
            throw new NoSuchElementException();
        }
        a();
        int i2 = this.b;
        mml mmlVar2 = this.a;
        if (i2 < mmlVar2.e) {
            this.b = i2 + 1;
            this.c = i2;
            Object[] objArr = mmlVar2.c;
            objArr.getClass();
            Object obj2 = objArr[i2];
            b();
            return obj2;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmk(mml mmlVar, int i) {
        super(mmlVar);
        this.d = i;
    }
}
