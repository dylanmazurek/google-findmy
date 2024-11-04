package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bul implements bum {
    private final ContentInfo.Builder a;

    public bul(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.bum
    public final bur a() {
        ContentInfo build;
        build = this.a.build();
        return new bur(new buo(build));
    }

    @Override // defpackage.bum
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.bum
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.bum
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
