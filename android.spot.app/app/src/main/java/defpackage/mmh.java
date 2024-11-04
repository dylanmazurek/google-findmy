package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmh extends mmj implements Iterator, mpq {
    public mmh(mml mmlVar) {
        super(mmlVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        mml mmlVar = this.a;
        int i = this.b;
        if (i < mmlVar.e) {
            this.b = i + 1;
            this.c = i;
            mmi mmiVar = new mmi(mmlVar, i);
            b();
            return mmiVar;
        }
        throw new NoSuchElementException();
    }
}
