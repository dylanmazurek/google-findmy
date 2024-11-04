package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrc {
    public hrc() {
    }

    public static void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            jax c = jbu.c((String) entry.getKey());
            try {
                ((hzn) ((mko) entry.getValue()).a()).a();
                c.close();
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void b(inv invVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        invVar.setBounds(rect);
        invVar.f(view, null);
    }

    public static void c(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static Uri d(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public hrc(byte[] bArr) {
    }

    public hrc(mko mkoVar) {
        mkoVar.getClass();
    }
}
