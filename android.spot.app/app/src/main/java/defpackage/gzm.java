package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzm implements gzf {
    public static final Map a = DesugarCollections.synchronizedMap(new rx());
    public static final Map b = DesugarCollections.synchronizedMap(new rx());
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new gzh();
    private final Executor e;
    private final hiq f;
    private final frx g;

    /* JADX WARN: Type inference failed for: r0v2, types: [his, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [his, java.lang.Object] */
    public gzm(Context context, ExecutorService executorService, frx frxVar, his hisVar) {
        ?? r0;
        Object obj;
        hnu hnuVar = new hnu(context);
        lzt lztVar = new lzt();
        lztVar.w(new hip[0]);
        if (hisVar != null) {
            lztVar.b = hisVar;
            lztVar.d = new hog((char[]) null);
            lztVar.c = new gzg(hnuVar, frxVar);
            lztVar.w(hip.a);
            ?? r7 = lztVar.b;
            if (r7 != 0 && (r0 = lztVar.c) != 0 && (obj = lztVar.d) != null) {
                hiq hiqVar = new hiq(r7, r0, (hog) obj, (jis) lztVar.a);
                this.e = executorService;
                this.f = hiqVar;
                this.g = frxVar;
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (lztVar.b == null) {
                sb.append(" imageRetriever");
            }
            if (lztVar.c == null) {
                sb.append(" secondaryImageRetriever");
            }
            if (lztVar.d == null) {
                sb.append(" defaultImageRetriever");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null imageRetriever");
    }

    public static void b(ImageView imageView, nhc nhcVar) {
        ijs.c();
        nhc nhcVar2 = (nhc) imageView.getTag(R.id.tag_account_image_request);
        if (nhcVar2 != null) {
            nhcVar2.a = true;
        }
        imageView.setTag(R.id.tag_account_image_request, nhcVar);
    }

    @Override // defpackage.gzf
    public final void a(Object obj, ImageView imageView) {
        ijs.c();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        nhc nhcVar = new nhc(obj, this.f, imageView, this.e);
        b(imageView, nhcVar);
        this.e.execute(new gcb(nhcVar, 12));
    }
}
