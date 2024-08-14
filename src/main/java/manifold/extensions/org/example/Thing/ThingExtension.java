package manifold.extensions.org.example.Thing;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.example.Thing;

@Extension
public class ThingExtension {
  public static String asJson(@This Thing thiz) {
      return "{ \"color\": \"" + thiz.color + "\", \"shape\": \"" + thiz.shape + "\" }";
  }
}