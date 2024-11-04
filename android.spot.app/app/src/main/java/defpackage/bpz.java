package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder contextual;
        contextual = builder.setContextual(z);
        return contextual;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder b(Notification.Builder builder, boolean z) {
        Notification.Builder allowSystemGeneratedContextualActions;
        allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z);
        return allowSystemGeneratedContextualActions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.Builder c(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        Notification.Builder bubbleMetadata2;
        bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
        return bubbleMetadata2;
    }

    static Notification.Builder d(Notification.Builder builder, Object obj) {
        Notification.Builder locusId;
        locusId = builder.setLocusId(apc$$ExternalSyntheticApiModelOutline0.m(obj));
        return locusId;
    }

    public static Typeface e(Context context, btl btlVar, int i, boolean z, int i2, Handler handler, bpy bpyVar) {
        Handler handler2;
        Object obj = null;
        elo eloVar = new elo(bpyVar, new qp(handler, 3, null), (byte[]) null);
        if (z) {
            String a = btp.a(btlVar, i);
            Typeface typeface = (Typeface) btp.a.b(a);
            if (typeface != null) {
                eloVar.D(new kvw(typeface));
                obj = typeface;
            } else if (i2 == -1) {
                kvw b = btp.b(a, context, btlVar, i);
                eloVar.D(b);
                obj = b.b;
            } else {
                try {
                    kvw kvwVar = (kvw) bqa.c(btp.b, new btm(a, context, btlVar, i), i2);
                    eloVar.D(kvwVar);
                    obj = kvwVar.b;
                } catch (InterruptedException unused) {
                    eloVar.D(new kvw(-3));
                }
            }
        } else {
            String a2 = btp.a(btlVar, i);
            Typeface typeface2 = (Typeface) btp.a.b(a2);
            if (typeface2 != null) {
                eloVar.D(new kvw(typeface2));
                obj = typeface2;
            } else {
                bto btoVar = new bto(eloVar, 1);
                synchronized (btp.c) {
                    ArrayList arrayList = (ArrayList) btp.d.get(a2);
                    if (arrayList != null) {
                        arrayList.add(btoVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(btoVar);
                        btp.d.put(a2, arrayList2);
                        btn btnVar = new btn(a2, context, btlVar, i);
                        ExecutorService executorService = btp.b;
                        bto btoVar2 = new bto(a2, 0);
                        if (Looper.myLooper() == null) {
                            handler2 = new Handler(Looper.getMainLooper());
                        } else {
                            handler2 = new Handler();
                        }
                        executorService.execute(new bts(handler2, btnVar, btoVar2));
                    }
                }
            }
        }
        return (Typeface) obj;
    }
}
