package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzg implements bzi {
    final InputContentInfo a;

    public bzg(Object obj) {
        this.a = ic$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    @Override // defpackage.bzi
    public final ClipDescription a() {
        ClipDescription description;
        description = this.a.getDescription();
        return description;
    }

    @Override // defpackage.bzi
    public final Uri b() {
        Uri contentUri;
        contentUri = this.a.getContentUri();
        return contentUri;
    }

    @Override // defpackage.bzi
    public final Uri c() {
        Uri linkUri;
        linkUri = this.a.getLinkUri();
        return linkUri;
    }

    @Override // defpackage.bzi
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.bzi
    public final void e() {
        this.a.requestPermission();
    }

    public bzg(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
