package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class buq implements bup {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public buq(bun bunVar) {
        ClipData clipData = bunVar.a;
        bqd.n(clipData);
        this.a = clipData;
        this.b = bunVar.b;
        this.c = bunVar.c;
        this.d = bunVar.d;
        this.e = bunVar.e;
    }

    @Override // defpackage.bup
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bup
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bup
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.bup
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                str = "SOURCE_DRAG_AND_DROP";
            } else {
                str = "SOURCE_INPUT_METHOD";
            }
        } else {
            str = "SOURCE_CLIPBOARD";
        }
        sb.append(str);
        sb.append(", flags=");
        if (1 != this.c) {
            str2 = "0";
        } else {
            str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        sb.append(str2);
        String str4 = "";
        if (this.d == null) {
            str3 = "";
        } else {
            str3 = ", hasLinkUri(" + this.d.toString().length() + ")";
        }
        sb.append(str3);
        if (this.e != null) {
            str4 = ", hasExtras";
        }
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
