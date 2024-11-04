package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwa implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            iwh iwhVar = (iwh) message.obj;
            int i2 = message.arg1;
            if (iwhVar.l() && iwhVar.j.getVisibility() == 0) {
                if (iwhVar.j.c == 1) {
                    ValueAnimator c = iwhVar.c(1.0f, 0.0f);
                    c.setDuration(iwhVar.d);
                    c.addListener(new ivx(iwhVar, i2));
                    c.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, iwhVar.b());
                    valueAnimator.setInterpolator(iwhVar.f);
                    valueAnimator.setDuration(iwhVar.e);
                    valueAnimator.addListener(new ivz(iwhVar, i2));
                    valueAnimator.addUpdateListener(new ioj(iwhVar, 6));
                    valueAnimator.start();
                }
            } else {
                iwhVar.m();
            }
            return true;
        }
        iwh iwhVar2 = (iwh) message.obj;
        if (iwhVar2.j.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = iwhVar2.j.getLayoutParams();
            if (layoutParams instanceof bos) {
                bos bosVar = (bos) layoutParams;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                baseTransientBottomBar$Behavior.g.a = iwhVar2.u;
                baseTransientBottomBar$Behavior.f = new njz(iwhVar2, null);
                bosVar.b(baseTransientBottomBar$Behavior);
                if (iwhVar2.d() == null) {
                    bosVar.g = 80;
                }
            }
            iwg iwgVar = iwhVar2.j;
            ViewGroup viewGroup = iwhVar2.h;
            iwgVar.g = true;
            viewGroup.addView(iwgVar);
            iwgVar.g = false;
            iwhVar2.h();
            iwhVar2.j.setVisibility(4);
        }
        if (iwhVar2.j.isLaidOut()) {
            iwhVar2.j();
        } else {
            iwhVar2.s = true;
        }
        return true;
    }
}
