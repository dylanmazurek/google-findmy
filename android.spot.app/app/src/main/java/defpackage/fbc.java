package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbc implements fbo {
    private static final Uri a;
    private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        a = builder.build();
    }

    @Override // defpackage.fbo
    public final Uri b() {
        return a;
    }

    @Override // defpackage.fbo
    public final void e(fbd fbdVar) {
        ArrayList arrayList = new ArrayList(fbdVar.g.values());
        Collections.sort(arrayList, new kg(13));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((fbf) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.b.println(sb.toString());
    }
}
