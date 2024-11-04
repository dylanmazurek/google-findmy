package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvl implements hvi {
    public static hvl a;
    public final Context b;
    private final ContentObserver c;

    public hvl() {
        this.b = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        Context context;
        synchronized (hvl.class) {
            hvl hvlVar = a;
            if (hvlVar != null && (context = hvlVar.b) != null && hvlVar.c != null) {
                context.getContentResolver().unregisterContentObserver(a.c);
            }
            a = null;
        }
    }

    @Override // defpackage.hvi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.b;
        if (context != null && !gad.c(context)) {
            try {
                return (String) hqt.d(new hvh() { // from class: hvj
                    @Override // defpackage.hvh
                    public final Object a() {
                        return fyo.b(hvl.this.b.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public hvl(Context context) {
        this.b = context;
        hvk hvkVar = new hvk();
        this.c = hvkVar;
        context.getContentResolver().registerContentObserver(fyp.a, true, hvkVar);
    }
}
