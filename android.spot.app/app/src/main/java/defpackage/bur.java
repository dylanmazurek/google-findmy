package defpackage;

import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bur {
    public final bup a;

    public bur(bup bupVar) {
        this.a = bupVar;
    }

    public static bur b(ContentInfo contentInfo) {
        return new bur(new buo(contentInfo));
    }

    public final ContentInfo a() {
        ContentInfo d = this.a.d();
        d.getClass();
        return d;
    }

    public final String toString() {
        return this.a.toString();
    }
}
