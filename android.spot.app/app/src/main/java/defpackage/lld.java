package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lld implements Iterator {
    private final ArrayDeque a;
    private lij b;

    public lld(lim limVar) {
        if (limVar instanceof llf) {
            llf llfVar = (llf) limVar;
            ArrayDeque arrayDeque = new ArrayDeque(llfVar.g);
            this.a = arrayDeque;
            arrayDeque.push(llfVar);
            this.b = b(llfVar.e);
            return;
        }
        this.a = null;
        this.b = (lij) limVar;
    }

    private final lij b(lim limVar) {
        while (limVar instanceof llf) {
            llf llfVar = (llf) limVar;
            this.a.push(llfVar);
            int[] iArr = llf.a;
            limVar = llfVar.e;
        }
        return (lij) limVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lij next() {
        lij lijVar;
        lij lijVar2 = this.b;
        if (lijVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            lijVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            llf llfVar = (llf) this.a.pop();
            int[] iArr = llf.a;
            lijVar = b(llfVar.f);
        } while (lijVar.z());
        this.b = lijVar;
        return lijVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
