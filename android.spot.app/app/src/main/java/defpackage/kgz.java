package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgz implements kgj {
    public static final kgz a = new kgz();

    private kgz() {
    }

    @Override // defpackage.kgj
    public final Class a() {
        return kgy.class;
    }

    @Override // defpackage.kgj
    public final Class b() {
        return kgy.class;
    }

    @Override // defpackage.kgj
    public final /* bridge */ /* synthetic */ Object c(ktn ktnVar) {
        if (ktnVar.b != null) {
            Iterator it = ktnVar.b().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new khj((byte[]) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
