package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class buo implements bup {
    private final ContentInfo a;

    public buo(ContentInfo contentInfo) {
        bqd.n(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.bup
    public final int a() {
        int flags;
        flags = this.a.getFlags();
        return flags;
    }

    @Override // defpackage.bup
    public final int b() {
        int source;
        source = this.a.getSource();
        return source;
    }

    @Override // defpackage.bup
    public final ClipData c() {
        ClipData clip;
        clip = this.a.getClip();
        return clip;
    }

    @Override // defpackage.bup
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
