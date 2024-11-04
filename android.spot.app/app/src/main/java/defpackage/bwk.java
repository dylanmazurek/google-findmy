package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwk implements OnReceiveContentListener {
    private final bvk a;

    public bwk(bvk bvkVar) {
        this.a = bvkVar;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        bvk bvkVar = this.a;
        bur b = bur.b(contentInfo);
        bur a = bvkVar.a(view, b);
        if (a == null) {
            return null;
        }
        if (a == b) {
            return contentInfo;
        }
        return a.a();
    }
}
