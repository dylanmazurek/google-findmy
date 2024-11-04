package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llc extends lig {
    final lld a;
    lii b = b();
    final /* synthetic */ llf c;

    public llc(llf llfVar) {
        this.c = llfVar;
        this.a = new lld(llfVar);
    }

    private final lii b() {
        lld lldVar = this.a;
        if (lldVar.hasNext()) {
            return lldVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.lii
    public final byte a() {
        lii liiVar = this.b;
        if (liiVar != null) {
            byte a = liiVar.a();
            if (!this.b.hasNext()) {
                this.b = b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
