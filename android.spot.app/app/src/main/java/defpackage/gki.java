package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gki extends gkm {
    private static final Charset c = Charset.forName("UTF-8");
    private final gjk d;
    private final gkr e;

    public gki(gjk gjkVar, gkr gkrVar) {
        this.d = gjkVar;
        this.e = gkrVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        List b = this.e.b(goaVar, 4);
        TreeSet treeSet = new TreeSet();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            treeSet.add(new String(((gkq) it.next()).b, c));
        }
        gjj c2 = this.d.c(goaVar, new ArrayList(treeSet), lgqVar);
        if (!c2.b() || !c2.d) {
            this.e.d(goaVar, b);
        }
        return c2;
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "DeleteUserSubscriptionCallback";
    }
}
