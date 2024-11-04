package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnb implements dje {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public dnb(Uri uri, eld eldVar, int i) {
        this.b = i;
        this.d = uri;
        this.c = eldVar;
    }

    public static dnb b(Context context, Uri uri, djx djxVar) {
        return new dnb(uri, new eld(dgo.b(context).b.a().b(), djxVar, dgo.b(context).d, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dnc, java.lang.Object] */
    @Override // defpackage.dje
    public final Class a() {
        if (this.b != 0) {
            return InputStream.class;
        }
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dnc, java.lang.Object] */
    @Override // defpackage.dje
    public final void d() {
        if (this.b != 0) {
            Object obj = this.a;
            if (obj != null) {
                try {
                    ((InputStream) obj).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            return;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            try {
                this.d.c(obj2);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:            if (r3 != null) goto L16;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: FileNotFoundException -> 0x00e0, TRY_LEAVE, TryCatch #2 {FileNotFoundException -> 0x00e0, blocks: (B:4:0x0006, B:60:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d4, B:23:0x00da, B:39:0x00c9, B:45:0x0048, B:47:0x0053, B:49:0x005d, B:51:0x0061, B:54:0x006d, B:55:0x0094, B:10:0x002f, B:68:0x0036, B:69:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #3, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4 A[Catch: FileNotFoundException -> 0x00e0, TRY_ENTER, TryCatch #2 {FileNotFoundException -> 0x00e0, blocks: (B:4:0x0006, B:60:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d4, B:23:0x00da, B:39:0x00c9, B:45:0x0048, B:47:0x0053, B:49:0x005d, B:51:0x0061, B:54:0x006d, B:55:0x0094, B:10:0x002f, B:68:0x0036, B:69:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #3, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048 A[Catch: FileNotFoundException -> 0x00e0, TryCatch #2 {FileNotFoundException -> 0x00e0, blocks: (B:4:0x0006, B:60:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d4, B:23:0x00da, B:39:0x00c9, B:45:0x0048, B:47:0x0053, B:49:0x005d, B:51:0x0061, B:54:0x006d, B:55:0x0094, B:10:0x002f, B:68:0x0036, B:69:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #3, #12 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [dnc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [djx, java.lang.Object] */
    @Override // defpackage.dje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.dgs r10, defpackage.djd r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnb.f(dgs, djd):void");
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    public dnb(File file, dnc dncVar, int i) {
        this.b = i;
        this.c = file;
        this.d = dncVar;
    }

    @Override // defpackage.dje
    public final void cr() {
    }
}
